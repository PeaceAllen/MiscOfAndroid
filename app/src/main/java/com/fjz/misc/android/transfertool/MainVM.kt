package com.fjz.misc.android.transfertool

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


/**
 * Created by Jinzhen Feng on 2022/3/23.
 * Copyright (c) 2022 Feng. All rights reserved.
 */
class MainVM: ViewModel() {

    val mUrlFromServer = MutableLiveData("")

    fun getUrlFromServer() {

        viewModelScope.launch {

            mUrlFromServer.value = "url form server: http://baidu.com"
        }


    }
}