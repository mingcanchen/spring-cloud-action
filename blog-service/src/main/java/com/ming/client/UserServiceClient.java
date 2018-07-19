package com.ming.client;

import com.ming.client.hystrix.UserServiceHystrix;
import com.ming.dto.RespDTO;
import com.ming.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


/**
 * @author chenmingcan
 */
@FeignClient(value = "user-service", fallback = UserServiceHystrix.class)
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
}



