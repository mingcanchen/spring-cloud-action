package com.ming.dao;

import com.ming.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author chenmingcan
 */
public interface SysLogDAO extends JpaRepository<SysLog, Long> {
}
