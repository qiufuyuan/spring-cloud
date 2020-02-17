package com.qfy.api.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IOrderService {

    //订单服务调用会员服务接口信息feign
    @RequestMapping("/orderToMember")
    public String orderToMember(String name);
}
