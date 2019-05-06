package com.gblfy.serviceribbon.service.impl;

import com.gblfy.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloServiceImpl
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 10:59
 * @Version 1.0
 **/
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
