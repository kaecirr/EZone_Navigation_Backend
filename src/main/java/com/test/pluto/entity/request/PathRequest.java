package com.test.pluto.entity.request;


/**
 * Description: Request from front end for API "/path"
 *
 *==============================================================
    {
        "requestMessage": "",
        "pathData": {
            "startBuildingName": "ComputerScience",
            "startFloor": "second",
            "startLongitude": "115.8599",
            "startLatitude": "-31.97444473",
            "endBuildingName": "ComputerScience",
            "endFloor": "second"
            "endLongitude": "115.823",
            "endLatitude": "-31.97222274",
            "algorithm": "DJ"
        }
    }
 *==============================================================
 * Created by captain on 2017/9/20.
 *
 * @author  Yuntian
 */
public class PathRequest extends RequestData{
    private PathData pathData;

    public void setPathData(PathData pathData) {
        this.pathData = pathData;
    }

    public PathData getPathData(){
        return this.pathData;

    }

}
