package com.gblfy.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author gblfy
 * @ClassNme GirlConfig
 * @Description 测试自动刷新
 * @Date 2019/4/29 0:49
 * @version1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlConfig {

    private String name;

    private Integer age;
}
