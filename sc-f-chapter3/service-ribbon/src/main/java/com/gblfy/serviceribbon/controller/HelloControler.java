package com.gblfy.serviceribbon.controller;

import com.gblfy.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 11:01
 * @Version 1.0
 **/
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hello(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
