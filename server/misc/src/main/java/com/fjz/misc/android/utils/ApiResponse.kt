package com.fjz.misc.android.utils

data class ApiResponse<T>(
    var msg: String? = null,
    var code: Int? = 200,
    var data: T? = null
)