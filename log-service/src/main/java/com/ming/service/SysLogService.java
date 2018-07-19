package com.ming.service;

import com.ming.dao.SysLogDAO;
import com.ming.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author chenmingcan
 */
@Service
public class SysLogService {

    @Autowired
    SysLogDAO sysLogDAO;

    public void saveLogger(SysLog sysLog) {
        sysLogDAO.save(sysLog);
    }
}
