package com.test.pluto.entity.request;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Request from front end for API "/floorPlan"
 *
 *==============================================================
 {
        "requestMessage": "",
        "floorData": [
            {
            "buildingName": "ComputerScience"
            }
        ]
 }
 *==============================================================
 *
 *
 * Created by captain on 2017/9/20.
 *
 * @author Yuntian
 */
public class FloorPlanRequest extends RequestData {
    private List<HashMap<String, String>> floorData;

    public FloorPlanRequest(){};

    public FloorPlanRequest(List<HashMap<String, String>> floorData) {
        this.floorData = floorData;
    }

    public List<HashMap<String, String>> getFloorData() {
        return floorData;
    }

    public void setFloorData(List<HashMap<String, String>> floorData) {
        this.floorData = floorData;
    }
}
