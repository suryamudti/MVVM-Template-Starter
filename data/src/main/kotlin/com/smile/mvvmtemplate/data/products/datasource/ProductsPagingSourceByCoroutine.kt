package com.smile.mvvmtemplate.data.products.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.smile.mvvmtemplate.data.products.entity.BeerMapper
import com.smile.mvvmtemplate.data.products.remote.ProductsApi
import com.smile.mvvmtemplate.domain.base.Failure
import com.smile.mvvmtemplate.domain.products.entity.Beer
import io.reactivex.rxjava3.annotations.NonNull
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException
import javax.inject.Inject
import javax.inject.Singleton


private const val STARTING_PAGE_INDEX = 1

@Singleton
class ProductsPagingSourceByCoroutine @Inject constructor(
    private val productsApi: ProductsApi,
    //private val query: String
) : PagingSource<Int, Beer>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Beer> {
        val position = params.key ?: STARTING_PAGE_INDEX
        //val apiQuery = query

        return try {
            val response = productsApi.getBeersListByCoroutine(position)
                .map {
                    BeerMapper().mapLeftToRight(it)
                }

            toLoadResult(response, position)
        } catch (e: Exception) {
            when (e) {
                is UnknownHostException, is SocketTimeoutException -> {
                    LoadResult.Error(
                        Failure.NoInternet(e.message)
                    )
                }
                is TimeoutException -> {
                    LoadResult.Error(
                        Failure.Timeout(e.message)
                    )
                }
                else -> {
                    LoadResult.Error(
                        Failure.Unknown(e.message)
                    )
                }
            }
        }
    }

    override val jumpingSupported = true

    override fun getRefreshKey(state: PagingState<Int, Beer>): Int? = state.anchorPosition

    private fun toLoadResult(
        @NonNull response: List<Beer>,
        position: Int,
    ): LoadResult<Int, Beer> {
        return LoadResult.Page(
            data = response,
            prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
            nextKey = if (response.isEmpty()) null else position + 1,
            itemsBefore = LoadResult.Page.COUNT_UNDEFINED,
            itemsAfter = LoadResult.Page.COUNT_UNDEFINED
        )
    }

}