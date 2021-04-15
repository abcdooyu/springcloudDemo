package com.eetco.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

        @Bean
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }

}
