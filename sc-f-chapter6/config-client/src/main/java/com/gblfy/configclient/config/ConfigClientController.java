package com.gblfy.configclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientApplication
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 13:31
 * @Version 1.0
 **/
@RestController
public class ConfigClientController {

    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/getFoo")
    public String getFoo(){
        return foo;
    }
}
