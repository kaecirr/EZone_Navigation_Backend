package com.test.pluto.entity.response;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Response from front end for API "/rooms"
 *
 *=============================================================
 {
    "responseMessage": "SUCCESS",
    "responseCode": "0000",
    "roomInfoData": [
        {
            "roomName": "Lab 2.05",
            "floor": "2",
            "roomDescription": "Computer lab 2.05 – Windows/Linux"
            "latitude": "115.81638582",
            "longitude": "-31.97766959"
        },
        {
            "roomName": "Room 1.18",
            "floor": "1",
            "roomDescription": "Office of Dr Rachel Cardel-Oliver"
            "latitude": "115.81638582",
            "longitude": "-31.97766959"
        },
        {
            "roomName": "Lab G.09",
            "floor": "0",
            "roomDescription": "Research laboratory"
            "latitude": "115.81638582",
            "longitude": "-31.97766959"
        }
    ]
 }

 *=============================================================
 *
 * Created by captain on 2017/10/2.
 *
 * @author Yuntian
 */
public class RoomsResponse extends ResponseData {

    private List<HashMap<String, String>> roomInfoData;


    public List<HashMap<String, String>> getRoomInfoData() {
        return roomInfoData;
    }

    public void setRoomInfoData(List<HashMap<String, String>> roomInfoData) {
        this.roomInfoData = roomInfoData;
    }

    public RoomsResponse(List<HashMap<String, String>> roomInfoData) {
        this.roomInfoData = roomInfoData;
    }

    public RoomsResponse(String responseMessage, String responseCode, List<HashMap<String, String>> roomInfoData) {
        super(responseMessage, responseCode);
        this.roomInfoData = roomInfoData;
    }


    public RoomsResponse(){};
}
