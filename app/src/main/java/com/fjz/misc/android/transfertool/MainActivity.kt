package com.fjz.misc.android.transfertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.fjz.misc.android.transfertool.databinding.ActivityMainBinding

/**
 * Created by Jinzhen Feng on 2022/3/23.
 * Copyright (c) 2022 Feng. All rights reserved.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val mainVM: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.lifecycleOwner = this
        mBinding.vm = mainVM




    }
}