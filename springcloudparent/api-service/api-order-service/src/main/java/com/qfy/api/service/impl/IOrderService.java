package com.qfy.api.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IOrderService {

    //����������û�Ա����ӿ���Ϣfeign
    @RequestMapping("/orderToMember")
    public String orderToMember(String name);
}
