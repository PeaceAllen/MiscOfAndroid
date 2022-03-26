package com.fjz.misc.android.transfertool

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fjz.misc.android.transfertool.entity.ApiResponse
import com.fjz.misc.android.transfertool.entity.Config
import com.fjz.misc.android.transfertool.http.RestHelper
import kotlinx.coroutines.launch
import java.lang.Exception


/**
 * Created by Jinzhen Feng on 2022/3/23.
 * Copyright (c) 2022 Feng. All rights reserved.
 */
class MainVM: ViewModel() {

    val mUrlFromServer = MutableLiveData<ApiResponse<Config?>?>()

    fun getUrlFromServer() {

        viewModelScope.launch {

            val response = try {
                RestHelper.mRestApi.getHttpUrl()
            } catch (e: Exception) {
                ApiResponse(msg = e.localizedMessage, -1)
            }

            mUrlFromServer.value = response
        }


    }
}