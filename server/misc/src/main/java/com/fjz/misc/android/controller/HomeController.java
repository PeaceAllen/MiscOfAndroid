package com.fjz.misc.android.controller;

import com.fjz.misc.android.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private TransferService transferService;

    @GetMapping("index")
    public String index() {
        return "index";
    }




}
