package com.eetco.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EetcoRule {

    @Bean
    public IRule myRule(){
        return new EetcoRandomRule(); //默认是轮询，现在我们定义为 EetcoRandomRule
    }
}
