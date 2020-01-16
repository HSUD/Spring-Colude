package com.demo.controller;

import com.demo.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer/")
public class ProducerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @Value("${server.port}")
    String port;

    @GetMapping("/tohello")
    public String tohello(@RequestParam String name) {
        return consumerFeignService.sayHiFromClientOne( name );
    }
}
