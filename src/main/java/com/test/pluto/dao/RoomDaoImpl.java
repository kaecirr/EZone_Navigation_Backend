package com.test.pluto.dao;

import com.test.pluto.bean.RoomBean;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Get rooms
 *
 * Created by captain on 2017/10/2.
 *
 * @author Yuntian
 */
@Repository
public class RoomDaoImpl implements RoomDao{

    private final Integer LOCATION_NAME = 0;
    private final Integer FLOOR_LEVEL = 1;
    private final Integer LONGITUDE = 2;
    private final Integer LATITUDE = 3;
    private final Integer DESCRIPTION = 4;

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }


    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    /**
     * Description: Convert row[] to roomBeans
     *
     * @param buildingName
     * @return
     */
    @Override
    public List<RoomBean> getRoomsByBuilding(String buildingName) {

        Session session = getSession();
        SQLQuery query = null;

        query = session.createSQLQuery("SELECT plutoDB.location.location_name, " +
                "plutoDB.floor.floor_level, plutoDB.location.longitude, plutoDB.location.latitude, plutoDB.location.description " +
                "FROM plutoDB.floor, plutoDB.building, plutoDB.location\n" +
                "where plutoDB.building.buildingId = plutoDB.floor.buildingId " +
                "and plutoDB.floor.floorId = plutoDB.location.floorId \n" +
                "and plutoDB.location.tag = 1 " +
                "and plutoDB.building.building_name=? ");

        query.setParameter(0, buildingName);

        List list = query.list();
        List<RoomBean> RoomBeans = new ArrayList<>();

        for(int i = 0; i < list.size(); i ++) {
            Object[] rows = (Object[])list.get(i);
            RoomBean roomBean = new RoomBean();
            roomBean.setRoomName(rows[LOCATION_NAME].toString());
            roomBean.setFloor(rows[FLOOR_LEVEL].toString());
            roomBean.setLongitude(rows[LONGITUDE].toString());
            roomBean.setLatitude(rows[LATITUDE].toString());
            roomBean.setRoomDescription(rows[DESCRIPTION].toString());

            RoomBeans.add(roomBean);
        }

        return RoomBeans;
    }
}
