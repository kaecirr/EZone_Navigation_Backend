package com.test.pluto.dao;

import com.test.pluto.entity.IndoorMap;

/**
 * Description: Construct the map for building
 *
 * Created by captain on 2017/10/1.
 *
 * @author Yuntian
 */
public interface MapDao {


    /**
     * Description: Construct the map for building
     *
     * @param buildingName
     * @param startFloor
     * @param endFloor
     * @return
     */
    IndoorMap getMapByBuilding(String buildingName, String startFloor, String endFloor);
}
