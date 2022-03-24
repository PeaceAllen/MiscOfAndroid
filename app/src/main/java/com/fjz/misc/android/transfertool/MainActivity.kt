package com.fjz.misc.android.transfertool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.arch.core.executor.ArchTaskExecutor
import androidx.lifecycle.ViewModel
import com.fjz.misc.android.transfertool.databinding.ActivityMainBinding

/**
 * Created by Jinzhen Feng on 2022/3/23.
 * Copyright (c) 2022 Feng. All rights reserved.
 */
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val mainVM: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.lifecycleOwner = this
        mBinding.vm = mainVM

        mainVM.mUrlFromServer.observe(this) {
            Log.i(TAG, "url = $it")
        }

    }
}