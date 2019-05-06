package com.gblfy.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @ClassName GirlConfig
 * @Deacription TODO
 * @Author gblfy
 * @Date 2019/5/6 18:08
 * @Version 1.0
 **/
@Data
@Component
@ConfigurationProperties(prefix = "girl")
@RefreshScope
public class GirlConfig {

    private String name;

    private Integer age;
}
