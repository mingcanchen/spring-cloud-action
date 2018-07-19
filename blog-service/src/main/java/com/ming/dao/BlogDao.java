package com.ming.dao;

import com.ming.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author chenmingcan
 */
public interface BlogDao extends JpaRepository<Blog, Long> {

    List<Blog> findByUsername(String username);

}
