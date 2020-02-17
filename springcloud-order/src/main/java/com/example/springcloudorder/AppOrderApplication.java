package com.example.springcloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //可以开启Feign
public class AppOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppOrderApplication.class, args);
    }

    //解决RestTemplate 找不到，应该把RestTemplate注册到Springboot容器中@Bean
    //如果使用rest方式以别名方式进行调用依赖ribbon负载均衡器@LoadBalanced
    @Bean
    //@LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
