package com.test.pluto.controller;


import com.test.pluto.bean.FloorPlanBean;
import com.test.pluto.bean.RoomBean;
import com.test.pluto.entity.Vertex;
import com.test.pluto.entity.request.FloorPlanRequest;
import com.test.pluto.entity.request.PathData;
import com.test.pluto.entity.request.PathRequest;
import com.test.pluto.entity.request.RoomsRequest;
import com.test.pluto.entity.response.*;
import com.test.pluto.service.MapService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description: Map controller has three API.
 *              1. "/path" is for path-finding.
 *              2. "/floorPlan" returns floorPlanId of floor.
 *              3. "/rooms" returns rooms of one building.
 *
 * @author Yuntian
 */
@Controller
public class MapController {

    private final String GROUND_FLOOR = "0";

    private final String RESPONSE_SCCUESS = "SUCCESS";
    private final String SCCUESS_CODE = "0000";

    private final String RESPONSE_ERROR = "ERROR";
    private final String ERROR_CODE_REQUEST = "0001";
    private final String ERROR_CODE_RESPONSE = "0002";


    @Autowired
    private MapService mapService;

    @Autowired(required = true)
    public void setUserService(MapService mapService) {
        this.mapService = mapService;
    }


    /**
     * Description: "/path" receives the request from front end for finding a shortest
     *               path between two locations and returns a List of location as a path.
     *
     * PathRequest:
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
     *
     * @param pathRequest
     * @return
     * @throws JSONException
     */
    @RequestMapping("/path")
    @ResponseBody
    public ResponseData pathFinding(@RequestBody PathRequest pathRequest) throws JSONException {

        // Response data
        MapDataResponse mapDataResponse = new MapDataResponse();
        MapData mapData = new MapData();


        // Get the request data from front, save to pathData
        PathData pathData = new PathData();
        if(null != pathRequest && null != pathRequest.getPathData()) {
            pathData = pathRequest.getPathData();
        }

        if (pathData.isParametersValid()) {

            // Result is a List of Vertex
            List<Vertex> result = mapService.pathFinding(pathData.getStartBuildingName(), pathData.getStartFloor(),
                    pathData.getStartLongitude(), pathData.getStartLatitude(), pathData.getEndBuildingName(),
                    pathData.getEndFloor(), pathData.getEndLongitude(), pathData.getEndLatitude(),
                    pathData.getAlgorithm());

            if (!result.isEmpty() && null != result) {

                // Set general information in response
                mapData.setStartBuildingName(pathData.getStartBuildingName());
                mapData.setStartFloor(pathData.getStartFloor());
                mapData.setEndBuildingName(pathData.getEndBuildingName());
                mapData.setEndFloor(pathData.getEndFloor());
                mapData.setStartLongitude(pathData.getStartLongitude());
                mapData.setStartLatitude(pathData.getStartLatitude());
                mapData.setEndLongitude(pathData.getEndLongitude());
                mapData.setEndLatitude(pathData.getEndLatitude());
                mapData.setAlgorithm(pathData.getAlgorithm());

                // Set each location information of path
                List<HashMap<String, String>> path = new ArrayList<>();
                for (int i = 0; i < result.size(); i++) {
                    HashMap<String, String> location = new HashMap<>();
                    location.put("buildingName", result.get(i).buildingName);
                    location.put("floor",        result.get(i).floorLevel);
                    location.put("locationName", result.get(i).locationName);
                    location.put("longitude",    result.get(i).longitude + "");
                    location.put("latitude",     result.get(i).latitude + "");
                    path.add(i, location);
                }
                // Set path information in response
                mapData.setPath(path);

                // Set the response data
                mapDataResponse.setMapData(mapData);
                mapDataResponse.setResponseMessage(RESPONSE_SCCUESS);
                mapDataResponse.setResponseCode(SCCUESS_CODE);

            } else {
                // Result is empty.
                mapDataResponse.setResponseMessage(RESPONSE_ERROR);
                mapDataResponse.setResponseCode(ERROR_CODE_RESPONSE);
            }

        } else {
            // Wrong with request data, parameter(s) empty
            mapDataResponse.setResponseMessage(RESPONSE_ERROR);
            mapDataResponse.setResponseCode(ERROR_CODE_REQUEST);
        }

        return mapDataResponse;
    }


    /**
     * Description: "/floorPlan" receives the request from front end for floorPlanId and
     *              returns floorPlanId.
     *              1. buildingName is not empty, returns floorPlanId in each floor of that building
     *              2. buildingName is empty, returns Ground floorPlanId in each building
     *
     * FloorPlanRequest:
     *==============================================================
     {
            "requestMessage": "",
            "floorData": {
                "buildingName": "ComputerScience"
            }
     }
     *==============================================================
     *
     *
     * @param floorPlanRequest
     * @return
     * @throws JSONException
     */
    @RequestMapping("/floorPlan")
    @ResponseBody
    public ResponseData getFloorPlan(@RequestBody FloorPlanRequest floorPlanRequest) throws JSONException {

        // Response Data
        FloorPlanResponse floorPlanResponse = new FloorPlanResponse();
        List<HashMap<String, String>> floorPlanData = new ArrayList<>();

        // If buildingName is empty
        if(floorPlanRequest.getFloorData().isEmpty()) {
            List<FloorPlanBean> floorPlanBeans = mapService.getFloorPlanByFloor(GROUND_FLOOR);

            for(int i = 0; i < floorPlanBeans.size(); i ++) {
                System.out.println("floorPlanBeans =" + floorPlanBeans.get(i).getFloorPlanId());
            }

            // Check floorPlanBeans
            if(floorPlanBeans.isEmpty()) {
                floorPlanResponse.setResponseMessage(RESPONSE_ERROR);
                floorPlanResponse.setResponseCode(ERROR_CODE_RESPONSE);
                return floorPlanResponse;
            }

            floorPlanResponse = getFloorPlanResponse(floorPlanBeans,floorPlanData,floorPlanResponse);
            return floorPlanResponse;
        } else {

            // If buildingName is not empty, get the floorData from request
            List<HashMap<String, String>> floorData = floorPlanRequest.getFloorData();

            // Here, only support for getting the first buildingName in request.
            List<FloorPlanBean> floorPlanBeans = mapService.getFloorPlanByName(floorData.get(0).get("buildingName"));


            for(int i = 0; i < floorPlanBeans.size(); i ++) {
                System.out.println("floorPlanBeans =" + floorPlanBeans.get(i).getFloorPlanId());
            }

            // Check floorPlanBeans
            if(floorPlanBeans.isEmpty()) {
                floorPlanResponse.setResponseMessage(RESPONSE_ERROR);
                floorPlanResponse.setResponseCode(ERROR_CODE_RESPONSE);
                return floorPlanResponse;
            }

            floorPlanResponse = getFloorPlanResponse(floorPlanBeans,floorPlanData,floorPlanResponse);
            return floorPlanResponse;
        }

    }


    /**
     *
     * Description:  "/rooms" receives the request from front end about buildingName and
     *               returns all rooms of that building.
     *
     * RoomsRequest:
     *=============================================================
     {
        "requestMessage": "",
        "roomData": {
            "buildingName": "ComputerScience"
        }
     }
     *=============================================================
     *
     * @param roomsRequest
     * @return
     * @throws JSONException
     */
    @RequestMapping("/rooms")
    @ResponseBody
    public ResponseData getRooms(@RequestBody RoomsRequest roomsRequest) throws JSONException {

        RoomsResponse roomsResponse = new RoomsResponse();

        if(!roomsRequest.getRoomData().isEmpty()) {

            //Get the floorData from request
            List<HashMap<String, String>> roomData = roomsRequest.getRoomData();

            // Here, only support for getting the first buildingName in request.
            List<RoomBean> roomBeans = mapService.getRoomsByBuilding(roomData.get(0).get("buildingName"));

            // Check roomBeans
            if (roomBeans.isEmpty()) {
                roomsResponse.setResponseMessage(RESPONSE_ERROR);
                roomsResponse.setResponseCode(ERROR_CODE_RESPONSE);
                return roomsResponse;
            }

            roomsResponse = getRoomsResponse(roomBeans, roomData, roomsResponse);
            return roomsResponse;

        } else {

            roomsResponse.setResponseMessage(RESPONSE_ERROR);
            roomsResponse.setResponseCode(ERROR_CODE_REQUEST);
            return roomsResponse;
        }
    }

    /**
     * Description: Add roomBeans to roomData, then add roomData to roomsResponse
     *
     * @param roomBeans
     * @param roomData
     * @param roomsResponse
     * @return
     */
    private RoomsResponse getRoomsResponse(List<RoomBean> roomBeans,
                                           List<HashMap<String, String>> roomData,
                                           RoomsResponse roomsResponse){

        for(int i = 0; i < roomBeans.size(); i ++ ) {
            HashMap<String, String> roomElement = new HashMap<>();
            roomElement.put("roomName",roomBeans.get(i).getRoomName());
            roomElement.put("floor", roomBeans.get(i).getFloor());
            roomElement.put("longitude", roomBeans.get(i).getLongitude());
            roomElement.put("latitude", roomBeans.get(i).getLatitude());
            roomElement.put("roomDescription", roomBeans.get(i).getRoomDescription());

            roomData.add(i, roomElement);
            roomsResponse.setRoomInfoData(roomData);
        }

        roomsResponse.setResponseMessage(RESPONSE_SCCUESS);
        roomsResponse.setResponseCode(SCCUESS_CODE);

        return roomsResponse;
    }


    /**
     * Description: Add a List of floorPlanBeans to floorPlanData, then add floorPlanData to floorPlanResponse
     *
     * @param floorPlanBeans
     * @param floorPlanData
     * @param floorPlanResponse
     * @return
     */
    private FloorPlanResponse getFloorPlanResponse(List<FloorPlanBean> floorPlanBeans,
                                                   List<HashMap<String, String>> floorPlanData,
                                                   FloorPlanResponse floorPlanResponse) {
        // Set each floorPlan information
        for(int i = 0; i < floorPlanBeans.size(); i ++ ) {
            HashMap<String, String> floorPlanElement = new HashMap<>();
            floorPlanElement.put("buildingName",floorPlanBeans.get(i).getBuildingName());
            floorPlanElement.put("floor",       floorPlanBeans.get(i).getFloorLevel());
            floorPlanElement.put("floorPlanID", floorPlanBeans.get(i).getFloorPlanId());
            floorPlanData.add(i, floorPlanElement);

            floorPlanResponse.setFloorPlanData(floorPlanData);
        }

        floorPlanResponse.setResponseMessage(RESPONSE_SCCUESS);
        floorPlanResponse.setResponseCode(SCCUESS_CODE);

        return floorPlanResponse;
    }


}
