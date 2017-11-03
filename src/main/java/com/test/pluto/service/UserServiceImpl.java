package com.test.pluto.service;

import com.test.pluto.dao.UserDao;
import com.test.pluto.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

/**
 * Description: For test
 *
 * Created by captain on 2017/5/14.
 *
 * @author Yuntian
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getUserByName(String name) {
        return this.userDao.getUserByName(name);
    }

}
