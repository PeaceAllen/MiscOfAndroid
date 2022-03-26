package com.fjz.misc.android.transfertool.http

import com.fjz.misc.android.transfertool.entity.ApiResponse
import com.fjz.misc.android.transfertool.entity.Config
import retrofit2.http.GET

/**
 * Created by Jinzhen Feng on 2022/2022/3/24.
 * Copyright (c) 2022 Podbean. All rights reserved.
 */
interface RestApi {

    @GET(HTTP_URL)
    suspend fun getHttpUrl(): ApiResponse<Config?>?

}