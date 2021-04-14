package com.lin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @author： 林功鑫
 * @date： 2021-04-14 10:06
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
