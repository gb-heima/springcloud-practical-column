package com.gblfy.configclient.controller;

import com.gblfy.configclient.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gblfy
 * @ClassNme GirlController
 * @Description TODO
 * @Date 2019/4/29 0:50
 * @version1.0
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/info")
    public String getGirlInfo() {
        return "name:" + girlConfig.getName() + ",age:" + girlConfig.getAge();
    }

}
