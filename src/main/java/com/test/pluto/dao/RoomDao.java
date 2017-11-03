package com.test.pluto.dao;

import com.test.pluto.bean.RoomBean;

import java.util.List;

/**
 * Description: Get rooms
 *
 * Created by captain on 2017/10/2.
 *
 * @author Yuntian
 */
public interface RoomDao {

    List<RoomBean> getRoomsByBuilding(String buildingName);
}
