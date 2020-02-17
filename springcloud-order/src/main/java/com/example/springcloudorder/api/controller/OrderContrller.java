package com.example.springcloudorder.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderContrller {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public String getOrder(){
        String url = "http://app-member/getMember";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println("result:"+result+"端口号："+serverPort);
        return result;
    }


}
