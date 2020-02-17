package com.qfy.api.service.feign;

import com.qfy.api.service.impl.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

//@FeignClient("app-member")
public interface MemberServiceFeign extends IMemberService {
}
