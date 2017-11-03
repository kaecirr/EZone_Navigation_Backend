package com.test.pluto.service;

import com.test.pluto.bean.FloorPlanBean;
import com.test.pluto.bean.RoomBean;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;

import java.util.HashMap;
import java.util.List;

/**
 * Description: MapService for MapController
 *
 * @author Yuntian
 */
public interface MapService {

    /**
     * Description: For path finding. Use this one.
     *
     * @param startBuildingName
     * @param startFloor
     * @param startLongitude
     * @param startLatitude
     * @param endBuildingName
     * @param endFloor
     * @param endLongitude
     * @param endLatitude
     * @param algorithm
     * @return
     */
    List<Vertex> pathFinding(String startBuildingName, String startFloor, String startLongitude, String startLatitude,
                             String endBuildingName, String endFloor, String endLongitude, String endLatitude,
                             String algorithm);

    /**
     * Description: Get floorPlan based on building
     *
     * @param buildingName
     * @return
     */
    List<FloorPlanBean> getFloorPlanByName(String buildingName);

    /**
     * Description: Get floorPlan based on floor level
     *
     * @param floor
     * @return
     */
    List<FloorPlanBean> getFloorPlanByFloor(String floor);

    /**
     * Description: Get rooms based on building
     *
     * @param buildingName
     * @return
     */
    List<RoomBean> getRoomsByBuilding(String buildingName);

}
