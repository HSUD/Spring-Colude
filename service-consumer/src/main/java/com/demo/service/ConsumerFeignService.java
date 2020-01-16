package com.demo.service;

import com.demo.service.Impl.ConsumerFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-producer",fallback = ConsumerFeignServiceImpl.class)
public interface ConsumerFeignService {

    @GetMapping(value = "/producer/hello")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
