package com.test.pluto.entity.response;

/**
 * Description: Response from front end for API "/path"
 *
 * *==============================================================
 *  {
        "responseMessage": "SUCCESS",
        "responseCode": "0000",
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
 * @author Yuntian
 */
public class MapDataResponse extends ResponseData{

    private MapData mapData;

    public void setMapData(MapData mapData) {
        this.mapData = mapData;
    }

    public MapData getMapData(){
        return this.mapData;

    }
}











