package com.ming.client.hystrix;

import com.ming.client.UserServiceClient;
import com.ming.dto.RespDTO;
import com.ming.entity.User;
import org.springframework.stereotype.Component;


/**
 * @author chenmingcan
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
