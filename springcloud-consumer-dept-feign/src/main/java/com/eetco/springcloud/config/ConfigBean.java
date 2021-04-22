package com.eetco.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
        //配置负载均衡RestTemplate
        //IRule 路由
        //AbstractLoadBalancerRule ：会先过滤掉，奔溃，访问故障的服务，会对剩下的进行轮询
        //RoundRobinRule : 轮询
        //RandomRule : 随机选择
        //RetryRule : 会先按照轮询获取服务~，如果服务获取失败，则会在指定的时间内进行重试
        @Bean
        @LoadBalanced//ribbon
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }

}
