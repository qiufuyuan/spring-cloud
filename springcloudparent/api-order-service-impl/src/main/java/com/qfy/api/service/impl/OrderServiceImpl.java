package com.qfy.api.service.impl;

import com.qfy.api.entity.UserEntity;
import com.qfy.api.service.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class OrderServiceImpl implements IOrderService{
//
//    @Autowired
//    private MemberServiceFeign memberServiceFeign;
//
//
//    @RequestMapping("/orderToMember")
//    public String orderToMember(String name) {
//        UserEntity user = memberServiceFeign.getMember(name);
//        return user == null ? "没有找到用户信息":user.toString();
//    }
//}


