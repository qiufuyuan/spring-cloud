package com.qfy.api.service.impl.impl;

import com.qfy.api.entity.UserEntity;
import com.qfy.api.service.impl.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements IMemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(20);
        return userEntity;
    }
}
