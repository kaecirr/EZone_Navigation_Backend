package com.test.pluto.dao;

import com.test.pluto.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description: For test
 *
 * Created by captain on 2017/5/14.
 *
 * @author Yuntian
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public User getUserByName(String name) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, name);
        return user;
    }
}
