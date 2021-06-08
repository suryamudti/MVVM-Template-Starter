package com.smile.mvvmtemplate.di.module

import com.smile.mvvmtemplate.data.products.datasource.ProductsPagingSource
import com.smile.mvvmtemplate.data.products.datasource.ProductsPagingSourceByCoroutine
import com.smile.mvvmtemplate.data.products.repository.ProductsListRepositoryImpl
import com.smile.mvvmtemplate.domain.products.repository.ProductsListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    @Provides
    @ViewModelScoped
    fun productsList(
        pagingSource: ProductsPagingSource,
        pagingSourceByCoroutine: ProductsPagingSourceByCoroutine
    ): ProductsListRepository =
        ProductsListRepositoryImpl(pagingSource, pagingSourceByCoroutine)

}