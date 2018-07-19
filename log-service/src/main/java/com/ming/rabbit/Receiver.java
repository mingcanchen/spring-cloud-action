package com.ming.rabbit;

import com.alibaba.fastjson.JSON;
import com.ming.entity.SysLog;
import com.ming.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


/**
 * @author chenmingcan
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    SysLogService sysLogService;

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        SysLog sysLog = JSON.parseObject(message, SysLog.class);
        sysLogService.saveLogger(sysLog);
        latch.countDown();
    }


}