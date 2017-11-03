package com.test.pluto.service;

import com.test.pluto.algorithm.AStarAlgorithm;
import com.test.pluto.algorithm.DjAlgorithm;
import com.test.pluto.bean.FloorPlanBean;
import com.test.pluto.bean.RoomBean;
import com.test.pluto.dao.FloorPlanDao;
import com.test.pluto.dao.MapDao;
import com.test.pluto.dao.RoomDao;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;
import com.test.pluto.utils.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Description: MapServiceImpl for MapController
 *
 * @author Yuntian
 */
@Service
public class MapServiceImpl implements MapService {


    @Autowired
    private FloorPlanDao floorPlanDao;

    @Autowired
    private MapDao mapDao;

    @Autowired
    private RoomDao roomDao;

    /**
     * Description: For path finding
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
    @Override
    @Transactional
    public List<Vertex> pathFinding(String startBuildingName, String startFloor, String startLongitude,
                                    String startLatitude, String endBuildingName, String endFloor,
                                    String endLongitude, String endLatitude,
                                    String algorithm) {
        List<Vertex> result = null;

        if (startBuildingName.equals(endBuildingName)) {

            // Construct indoor map based on building, startFloor and endFloor
           IndoorMap map = mapDao.getMapByBuilding(startBuildingName, startFloor, endFloor);

           System.out.println("%%%%%%%%% startLongitude, startLatitude = " + startLongitude + startLatitude);
           System.out.println("%%%%%%%%% endLongitude, endLatitude = " + endLongitude + endLatitude);
           // Get the nearest vertex based on longitude and latitude
           Vertex startVertex = getNearestVertexOnFloor(map, startLongitude, startLatitude, startFloor);
           Vertex endVertex = getNearestVertexOnFloor(map, endLongitude, endLatitude, endFloor);
           System.out.println("!!!!!!!!! startVertex = " + startVertex.toString());
           System.out.println("!!!!!!!!! endVertex = " + endVertex.toString());

           if(algorithm.equals("DJ") || algorithm.isEmpty() || algorithm.equals(null)) {
               result = map.findPath(startVertex, endVertex, new DjAlgorithm());
           } else {
               result = map.findPath(startVertex, endVertex, new AStarAlgorithm());
           }

           for(int i = 0; i < result.size(); i ++) {
               System.out.println("location" + i + " = " + result.get(i).toString() + " lgt:" +
                       result.get(i).longitude + " ltd:" + result.get(i).latitude);
           }

           return result;
       } else if (!startBuildingName.equals(endBuildingName)){
            // Navigation between different buildings
            // To DO
       } else {

            return result;
        }

        return result;
    }



    /**
     * Description: Get the nearest vertex based on longitude and latitude
     *
     * @param map
     * @param longitude
     * @param latitude
     * @return
     */
    private Vertex getNearestVertexOnFloor(IndoorMap map, String longitude,
                                              String latitude, String floor) {
        Double minDistance = Double.POSITIVE_INFINITY, currentDistance;
        Vertex nearestVertex = null;

        for (int i = 0; i < map.getVertex().size(); i++) {

            // Find the nearest vertex in floor
            if(map.getVertex().get(i).getFloorLevel().equals(floor)) {
                currentDistance = MathUtils.getDistanceBetweenTwoVertex(map.getVertex().get(i).longitude,
                        map.getVertex().get(i).latitude,
                        Double.parseDouble(longitude), Double.parseDouble(latitude));

                if (currentDistance <= minDistance) {
                    minDistance = currentDistance;
                    nearestVertex = map.getVertex().get(i);
                }

            }
        }

        return nearestVertex;
    }

    /**
     * Description: Get floorPlan based on building
     *
     * @param buildingName
     * @return
     */
    @Override
    @Transactional
    public List<FloorPlanBean> getFloorPlanByName(String buildingName) {
        return floorPlanDao.getFloorPlanByName(buildingName);
    }


    /**
     * Description: Get floorPlan based on floor
     *
     * @param floor
     * @return
     */
    @Override
    @Transactional
    public List<FloorPlanBean> getFloorPlanByFloor(String floor) {
        return floorPlanDao.getFloorPlanByFloor(floor);
    }


    /**
     * Description: Get rooms based on building
     *
     * @param buildingName
     * @return
     */
    @Override
    @Transactional
    public  List<RoomBean> getRoomsByBuilding(String buildingName) {
        return roomDao.getRoomsByBuilding(buildingName);
    }


}
