package com.ming.client.hystrix;


import com.ming.client.AuthServiceClient;
import com.ming.entity.JWT;
import org.springframework.stereotype.Component;


/**
 * @author chenmingcan
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("--------opps getToken hystrix---------");
        return null;
    }
}
