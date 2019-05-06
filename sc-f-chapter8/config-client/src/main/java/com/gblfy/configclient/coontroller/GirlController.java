package com.gblfy.configclient.coontroller;

import com.gblfy.configclient.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GirlController
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 18:08
 * @Version 1.0
 **/
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print() {
        return "name:" + girlConfig.getName() + "," + girlConfig.getAge();
    }
}
