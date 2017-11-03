package com.test.pluto.dao;

import com.test.pluto.bean.FloorPlanBean;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Get floorPlan
 *
 * Created by captain on 2017/9/29.
 *
 * @author Yuntian
 */
@Repository
public class FloorPlanDaoImpl implements FloorPlanDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }


    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public List<FloorPlanBean> getFloorPlanByName(String buildingName) {

        Session session = getSession();
        Criteria c = session.createCriteria(FloorPlanBean.class);
        c.add(Restrictions.eq("buildingName", buildingName));
        List<FloorPlanBean> floorPlanBeans = c.list();
//        for(FloorPlanBean floorPlanBean: floorPlanBeans){
//            System.out.println("*************** floorPlanId=" + floorPlanBean.getFloorPlanId());
//        }

        return floorPlanBeans;

    }


    @Override
    public List<FloorPlanBean> getFloorPlanByFloor(String floor) {

        Session session = getSession();
        Criteria c = session.createCriteria(FloorPlanBean.class);
        c.add(Restrictions.eq("floorLevel", floor));
        List<FloorPlanBean> floorPlanBeans = c.list();
//        for(FloorPlanBean floorPlanBean: floorPlanBeans){
//            System.out.println("*************** floorPlanId=" + floorPlanBean.getFloorPlanId());
//        }

        return floorPlanBeans;

    }

}
