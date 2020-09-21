package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;

import java.util.List;

/**
 * @author Administrator
 * @create 2020 07 21 16:30
 */
public interface IAccountDao {
    List<Account> findAll();

    /**
     * 查询所有账户，并且带有用户名和地址信息
     *
     * @return
     */
    List<AccountUser> findAllAccount();

}
