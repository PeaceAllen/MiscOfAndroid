package com.fjz.misc.android.controller;



import com.fjz.misc.android.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @Autowired
    private TransferService transferService;


    @GetMapping("/hello")
    public String hello() {

        transferService.insertOneConfiguration();
        return transferService.getAndroid();
    }
}
