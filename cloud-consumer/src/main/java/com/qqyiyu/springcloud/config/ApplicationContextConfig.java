package com.qqyiyu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    //类似于applicationContext.xml中 <bean id="" class="">
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
