package com.ming.service;

import com.alibaba.fastjson.JSON;
import com.ming.config.RabbitConfig;
import com.ming.entity.SysLog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author chenmingcan
 */
@Service
public class LoggerService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void log(SysLog sysLog) {
        rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_NAME, JSON.toJSONString(sysLog));
    }
}
