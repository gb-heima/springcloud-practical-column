package com.gblfy.servicefeign.controller;

import com.gblfy.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 11:23
 * @Version 1.0
 **/
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
//    测试链接：http://localhost:8765/hi?name=gblfy
}
