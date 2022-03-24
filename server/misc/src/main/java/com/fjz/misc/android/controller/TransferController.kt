package com.fjz.misc.android.controller


import com.fjz.misc.android.entity.Configurations
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.fjz.misc.android.service.TransferService
import org.springframework.web.bind.annotation.GetMapping
import com.fjz.misc.android.utils.ApiResponse
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping("/api/config/")
class TransferController {

    @Autowired
    private lateinit var transferService: TransferService


    @GetMapping("all")
    fun allConfigList(): ApiResponse<List<Configurations>> {
        val allConfigs = transferService.allConf

        return ApiResponse(null, 200, allConfigs)
    }

    @PostMapping("add")
    fun addOrUpdateConfig(@RequestParam("key") key: String, @RequestParam("value")  value: String) : ApiResponse<Int> {
        val count = transferService.insertOneConfiguration(key, value)
        return ApiResponse(data = count)
    }


    @GetMapping("{key}")
    fun reqHttpUrl(@PathVariable("key") key: String): ApiResponse<Configurations> {

        val config = transferService.getValueByKey(key)

        return ApiResponse("success", 200, config)
    }
}