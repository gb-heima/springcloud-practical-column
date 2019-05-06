package com.gblfy.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 10:20
 * @Version 1.0
 **/
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "gblfy") String name) {
        return "hi," + name + ",i am from port" + port;
    }
}
