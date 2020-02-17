package com.example.springcloudorder.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RibbonController {

    //可以获取注册中心上的服务列表
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    private int reqCount = 1;

    @RequestMapping("/getRibbon")
    public String ribbonMember(){
        String instanceUrl = getInstances()+"/getMember";
        System.out.println("instanceUrl："+instanceUrl);
        return restTemplate.getForObject(instanceUrl,String.class);
    }

    public String getInstances(){
        List<ServiceInstance> instances = discoveryClient.getInstances("app-member");
        if(instances ==null || instances.size()<=0){
            return null;
        }
        //获取服务器集群个数
        int instanceSize = instances.size();
        int serviceIndex = reqCount % instanceSize;
        reqCount++;
        return instances.get(serviceIndex).getUri().toString();
    }
}
