package com.test.pluto.dao;

import com.test.pluto.bean.FloorPlanBean;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Get floorPlan.
 *
 * Created by captain on 2017/9/29.
 *
 * @author Yuntian
 */
public interface FloorPlanDao {

    List<FloorPlanBean> getFloorPlanByName(String buildingName);

    List<FloorPlanBean> getFloorPlanByFloor(String floor);
}
