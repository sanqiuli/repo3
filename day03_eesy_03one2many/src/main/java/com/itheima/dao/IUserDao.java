package com.itheima.dao;


import com.itheima.domain.User;

import java.util.List;

/**
 * @author Administrator
 * @create 2020 07 21 16:29
 */
public interface IUserDao {
    List<User> findAll();
}
