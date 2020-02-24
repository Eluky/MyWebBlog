package com.eluky.blog.dao;

import com.eluky.blog.info.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserInfo,Integer> {
    UserInfo findByUsername(String username);

    UserInfo getByUsernameAndPassword(String username,String password);
}
