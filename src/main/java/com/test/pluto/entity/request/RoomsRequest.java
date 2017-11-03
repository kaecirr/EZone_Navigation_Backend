package com.test.pluto.entity.request;

import java.util.HashMap;
import java.util.List;

/**
 * Description: Request from front end for API "/rooms"
 *
 *==============================================================
 *{
        "requestMessage": "",
        "roomData": {
            "buildingName": "ComputerScience"
        }
 }
 *==============================================================
 *
 *
 * Created by captain on 2017/10/2.
 *
 * @author Yuntian
 */
public class RoomsRequest extends RequestData {

    private List<HashMap<String, String>> roomData;

    public RoomsRequest(String requestMessage, List<HashMap<String, String>> roomData) {
        super(requestMessage);
        this.roomData = roomData;
    }

    public RoomsRequest(List<HashMap<String, String>> roomData) {
        this.roomData = roomData;
    }

    public RoomsRequest(){};

    public List<HashMap<String, String>> getRoomData() {
        return roomData;
    }

    public void setRoomData(List<HashMap<String, String>> roomData) {
        this.roomData = roomData;
    }
}
