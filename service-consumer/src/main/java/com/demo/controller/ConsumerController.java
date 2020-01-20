package com.demo.controller;

import com.demo.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer/")
public class ConsumerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String applicationName;



    @GetMapping("getHello")
    public String getHello() {
        return applicationName +" "+ port + "  rpc==== >" +consumerFeignService.gethello();
    }

}
