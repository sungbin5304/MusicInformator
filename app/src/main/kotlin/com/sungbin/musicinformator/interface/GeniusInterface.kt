package com.sungbin.musicinformator.`interface`

import com.google.gson.JsonObject
import com.sungbin.musicinformator.utils.GeniusManager
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * Created by SungBin on 2020-07-28.
 */

interface GeniusInterface {
    @GET("account") //test task
    fun getAccountData(): Flowable<JsonObject>

    @GET("songs/{id}")
    fun getSongData(@Path("id") id: String): Flowable<JsonObject>

    @GET("{type}")
    fun getSearchData(
        @Path("type") type: String,
        @Query("sort") sort: String,
        @Query("per_page") perPage: Int,
        @Query("page") page: Int,
        @Query("q") query: String
    ): Flowable<JsonObject>
}