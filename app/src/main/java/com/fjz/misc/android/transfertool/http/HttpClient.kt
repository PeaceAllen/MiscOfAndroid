package com.fjz.misc.android.transfertool.http

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit


/**
 * Created by Jinzhen Feng on 2022/3/24.
 * Copyright (c) 2022 Podbean. All rights reserved.
 */
object HttpClient {

    private const val TAG = "HTTP-CLIENT"
    private const val CONNECT_TIMEOUT = 30L
    private const val READ_TIMEOUT = 30L
    private const val WRITE_TIMEOUT = 30L


    private val mLogger = HttpLoggingInterceptor.Logger {
        Log.i(TAG, "ok-http: $it")
    }

    val mLogInterceptor = HttpLoggingInterceptor(mLogger).apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    val mClient = OkHttpClient.Builder()
        .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
        .addInterceptor(mLogInterceptor)
        .build()





}