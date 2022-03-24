package com.fjz.misc.android.transfertool.http

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Jinzhen Feng on 2022/3/24.
 * Copyright (c) 2022 Podbean. All rights reserved.
 */
object RestHelper {

    private val mRetrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(HttpClient.mClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val mRestApi = mRetrofit.create(RestApi::class.java)


}