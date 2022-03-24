package com.fjz.misc.android.transfertool.entity


/**
 * Created by Jinzhen Feng on 2022/3/24.
 * Copyright (c) 2022 Podbean. All rights reserved.
 */
data class ApiResponse<T>(var msg: String? = null, var code: Int = 0, var data: T? = null)

