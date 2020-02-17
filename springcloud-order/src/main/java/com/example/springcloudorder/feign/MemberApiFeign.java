package com.example.springcloudorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "app-member")
public interface MemberApiFeign {

    //Feign 书写形式以SpringMVC接口形式书写
    @RequestMapping("/getMember")
    public String getMember();
}
