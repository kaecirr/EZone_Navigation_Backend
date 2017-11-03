package com.test.pluto.entity.response;

import java.util.HashMap;
import java.util.List;

/**
 * Description: MapData in MapDataResponse, check MapDataResponse for more
 *              information.
 *
 *
 * *==============================================================
 *  {
        "mapData": {
            "startBuildingName": "ComputerScience",
            "startFloor": "0",
            "startLongitude": "115.81614181702795",
            "startLatitude": "-31.97766513843875",
            "endBuildingName": "ComputerScience",
            "endFloor": "2",
            "endLongitude": "115.81632245332001",
            "endLatitude": "-31.977580289763754",
            "algorithm": null,
            "path": [
                {
                    "buildingName": "ComputerScience",
                    "locationName": "RightCorridor8",
                    "latitude": "-31.97766675",
                    "floor": "0",
                    "longitude": "115.81614107"
                },
                {
                    "buildingName": "ComputerScience",
                    "locationName": "RightStair4",
                    "latitude": "-31.97771111",
                    "floor": "1",
                    "longitude": "115.81632815"
                },
                {
                    "buildingName": "ComputerScience",
                    "locationName": "RightStair1",
                    "latitude": "-31.97770201",
                    "floor": "2",
                    "longitude": "115.81637911"
                },
                {
                    "buildingName": "ComputerScience",
                    "locationName": "Room2.07",
                    "latitude": "-31.97758768",
                    "floor": "2",
                    "longitude": "115.81632413"
                }
            ] //end path
        }// end mapData
 }
 * *==============================================================
 *
 * Created by captain on 2017/9/20.
 *
 * @author Yuntian
 */
public class MapData {
    private String startBuildingName;
    private String startFloor;
    private String startLongitude;
    private String startLatitude;
    private String endBuildingName;
    private String endFloor;
    private String endLongitude;
    private String endLatitude;
    private String algorithm;
    private List<HashMap<String, String>> path;


    public String getStartBuildingName() {
        return startBuildingName;
    }

    public void setStartBuildingName(String startBuildingName) {
        this.startBuildingName = startBuildingName;
    }

    public String getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(String startFloor) {
        this.startFloor = startFloor;
    }

    public String getEndBuildingName() {
        return endBuildingName;
    }

    public void setEndBuildingName(String endBuildingName) {
        this.endBuildingName = endBuildingName;
    }

    public String getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(String endFloor) {
        this.endFloor = endFloor;
    }

    public String getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(String startLongitude) {
        this.startLongitude = startLongitude;
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    public String getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<HashMap<String, String>> getPath() {
        return path;
    }

    public void setPath(List<HashMap<String, String>> path) {
        this.path = path;
    }
}
