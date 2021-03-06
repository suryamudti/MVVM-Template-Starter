package com.smile.mvvmtemplate.domain.products.usecase

import androidx.paging.PagingData
import com.smile.mvvmtemplate.domain.base.usecase.GeneralUseCase
import com.smile.mvvmtemplate.domain.products.entity.Beer
import com.smile.mvvmtemplate.domain.products.repository.ProductsListRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBeersListByCoroutineUseCase @Inject constructor(
    private val productsListRepository: ProductsListRepository,
) : GeneralUseCase<Flow<PagingData<Beer>>, GetBeersListByCoroutineParams> {

    override fun invoke(params: GetBeersListByCoroutineParams): Flow<PagingData<Beer>> =
        productsListRepository.getBeersListByCoroutine(params.ids)

}

@JvmInline
value class GetBeersListByCoroutineParams(val ids: String)