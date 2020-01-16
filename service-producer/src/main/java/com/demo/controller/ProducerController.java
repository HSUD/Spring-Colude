package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer/")
public class ProducerController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + " ,i am port:" + port;
    }
}
