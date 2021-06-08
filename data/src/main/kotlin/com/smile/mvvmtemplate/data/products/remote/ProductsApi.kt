package com.smile.mvvmtemplate.data.products.remote

import com.smile.mvvmtemplate.data.network.BaseApiService
import com.smile.mvvmtemplate.data.network.GenericNetworkResponse
import com.smile.mvvmtemplate.data.products.entity.BeerResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductsApi : BaseApiService {

    @GET("beers")
    fun getBeersList(
        /*@Query("ids") ids: String,*/
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 40,
    ): Single<GenericNetworkResponse<List<BeerResponse>>>

    @GET("beers")
    suspend fun getBeersListByCoroutine(
        /*@Query("ids") ids: String,*/
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 40,
    ): List<BeerResponse>

}