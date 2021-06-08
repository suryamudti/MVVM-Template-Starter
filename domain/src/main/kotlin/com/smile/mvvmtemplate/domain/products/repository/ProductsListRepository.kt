package com.smile.mvvmtemplate.domain.products.repository

import androidx.paging.PagingData
import com.smile.mvvmtemplate.domain.products.entity.Beer
import io.reactivex.rxjava3.core.Flowable
import kotlinx.coroutines.flow.Flow

interface ProductsListRepository {

    fun getBeersList(ids: String): Flowable<PagingData<Beer>>

    fun getBeersListByCoroutine(ids: String): Flow<PagingData<Beer>>

}