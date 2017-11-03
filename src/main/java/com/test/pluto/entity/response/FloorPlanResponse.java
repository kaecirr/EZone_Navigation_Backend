package com.test.pluto.entity.response;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Response from front end for API "/floorPlan"
 *
 *==============================================================
 *{
        "responseMessage": "SUCCESS",
        "responseCode": "0000",
        "floorPlanData": [
            {
                "buildingName": "computerScience",
                "floor": "0",
                "floorPlanID": "7348 - 4948 - 9834 - 3924"
            },
            {
                "buildingName": "ECM",
                "floor": "0",
                "floorPlanID": "7348 - 4948 - 9834 - 3924"
            },
            {
                "buildingName": "Environment",
                "floor": "0",
                "floorPlanID": "7348 - 4948 - 9834 - 3924"
            }
        ]
 }
 *==============================================================
 *
 * Created by captain on 2017/9/20.
 *
 * @author Yuntian
 */
public class FloorPlanResponse extends ResponseData{
    private List<HashMap<String, String>> floorPlanData;

    public FloorPlanResponse() {
    }

    public FloorPlanResponse(List<HashMap<String, String>> floorPlanData) {
        this.floorPlanData = floorPlanData;
    }

    public List<HashMap<String, String>> getFloorPlanData() {
        return floorPlanData;
    }

    public void setFloorPlanData(List<HashMap<String, String>> floorPlanData) {
        this.floorPlanData = floorPlanData;
    }
}
