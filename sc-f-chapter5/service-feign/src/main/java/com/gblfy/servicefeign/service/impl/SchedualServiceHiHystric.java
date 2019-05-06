package com.gblfy.servicefeign.service.impl;

import com.gblfy.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 12:20
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name+"太拥挤了，请稍后尝试！";
    }
}
