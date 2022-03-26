package com.fjz.misc.android.utils

data class ApiResponse<T>(
    var msg: String? = null,
    var code: Int? = 200,
    var data: T? = null
) {
    companion object {

        fun <T> success(msg: String? = "Success", code: Int? = 0, data: T? = null): ApiResponse<T> {
            return ApiResponse(msg, code, data)
        }

        fun error(msg: String? = "Failed", code: Int? = -1): ApiResponse<Int> {
            return ApiResponse(msg, code, null)
        }
    }
}