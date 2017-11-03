package com.test.pluto.dao;

import com.test.pluto.algorithm.DjAlgorithm;
import com.test.pluto.entity.Edge;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Description: Construct the map for building
 *
 * Created by captain on 2017/10/1.
 *
 * @author Yuntian
 */
@Repository
public class MapDaoImpl implements MapDao {

    private final Integer LOCATIONID = 0;
    private final Integer LOCATION_NAME = 1;
    private final Integer FLOOR_LEVEL = 2;
    private final Integer LONGITUDE = 3;
    private final Integer LATITUDE = 4;
    private final Integer LINKID = 5;
    private final Integer DISTANCE = 6;
    private final Integer BUILDING_NAME = 7;

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    /**
     * Description: Three sql query based on different situation.
     *              1. startFloor = endFloor
     *              2. startFloor < endFloor. eg, startFloor = 0, endFloor = 2
     *              3. startFloor > endFloor. eg, startFloor = 2, endFloor = 0
     *              After query finished, the result is stored in a List, each List content is row[] Object.
     *              row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7] represents locationId,
     *              location_name, floor_level, longitude, latitude, linkId, distance, building_name separately.
     *              Here, firstly convert row[] Object to vertex. Then, set Edge[] to vertex adjacency.
     *
     *
     * @param buildingName
     * @param startFloor
     * @param endFloor
     * @return
     */
    @Override
    public IndoorMap getMapByBuilding(String buildingName, String startFloor, String endFloor) {

        Session session = getSession();
        SQLQuery query = null;

        if (startFloor.equals(endFloor)) {
            query = session.createSQLQuery("SELECT plutoDB.location.locationId, location_name, " +
                    "floor_level, longitude, latitude, linkId, distance, building_name " +
                    "FROM plutoDB.location, plutoDB.building, plutoDB.floor, plutoDB.link\n" +
                    "where building_name =? and " +
                    "plutoDB.location.floorId =  plutoDB.floor.floorId and " +
                    "plutoDB.floor.floor_level =? and\n" +
                    "plutoDB.link.locationId = plutoDB.location.locationId");

            query.setParameter(0, buildingName);
            query.setParameter(1, Integer.parseInt(startFloor));
        } else if (Integer.parseInt(startFloor) < Integer.parseInt(endFloor)){

            query = session.createSQLQuery("SELECT plutoDB.location.locationId, location_name, " +
                    "floor_level, longitude, latitude, linkId, distance, building_name " +
                    "FROM plutoDB.location, plutoDB.building, plutoDB.floor, plutoDB.link\n" +
                    "where building_name =? and " +
                    "plutoDB.location.floorId =  plutoDB.floor.floorId and " +
                    "plutoDB.floor.floor_level >=?  and " +
                    "plutoDB.floor.floor_level <=? and\n" +
                    "plutoDB.link.locationId = plutoDB.location.locationId");

            query.setParameter(0, buildingName);
            query.setParameter(1, Integer.parseInt(startFloor));
            query.setParameter(2, Integer.parseInt(endFloor));
        } else {

            query = session.createSQLQuery("SELECT plutoDB.location.locationId, location_name, " +
                    "floor_level, longitude, latitude, linkId, distance, building_name " +
                    "FROM plutoDB.location, plutoDB.building, plutoDB.floor, plutoDB.link\n" +
                    "where building_name =? and " +
                    "plutoDB.location.floorId =  plutoDB.floor.floorId and " +
                    "plutoDB.floor.floor_level >=?  and " +
                    "plutoDB.floor.floor_level <=? and\n" +
                    "plutoDB.link.locationId = plutoDB.location.locationId");

            query.setParameter(0, buildingName);
            query.setParameter(1, Integer.parseInt(endFloor));
            query.setParameter(2, Integer.parseInt(startFloor));
        }


        List queryList = query.list(); //  Query result from database.
        List<Vertex> vertices = new ArrayList<>(); // all vertex stored in a List
        HashMap<String, String> linkedNode = null;
        HashMap<String, Vertex> IDMap = new HashMap<>(); // IdentityMap, save (LOCATIONID, vertex) in map
        Vertex vertex = null;
        String lastLocationId = "";
        int j = 0;

        for(int i = 0; i < queryList.size(); i ++) {
            Object[] rows = (Object[])queryList.get(i); //

            // Store each vertex
            if(!lastLocationId.equals(rows[LOCATIONID].toString())) {
                vertex = new Vertex();
                linkedNode = new HashMap<>();

                vertex.setLocationId(  rows[LOCATIONID].toString());    // locationId
                vertex.setLocationName(rows[LOCATION_NAME].toString()); // locationName
                vertex.setFloorLevel(  rows[FLOOR_LEVEL].toString());   // floorLevel
                vertex.setLongitude(Double.parseDouble(rows[LONGITUDE].toString())); // longitude
                vertex.setLatitude(Double.parseDouble( rows[LATITUDE].toString()));  // latitude
                vertex.setBuildingName(rows[BUILDING_NAME].toString()); // buildingName

                // Set first linkedNode and distance
                linkedNode.put(rows[LINKID].toString(), rows[DISTANCE].toString());
                vertex.setLinkLocation(linkedNode); // link

                lastLocationId = rows[LOCATIONID].toString();
                IDMap.put(rows[LOCATIONID].toString(), vertex); // Set a new vertex into IDMap
                vertices.add(j, vertex);
                j++;

            } else {

                // If the second time is also the same location, just store its linkID and distance
                linkedNode.put(rows[LINKID].toString(), rows[DISTANCE].toString());
                vertex.setLinkLocation(linkedNode);
                lastLocationId = rows[LOCATIONID].toString();
            }
        }


        // Set vertex adjacency into Edge[], more detail see Class Vertex and Class Edge
        for(int i = 0; i < vertices.size(); i ++) {

            int length = vertices.get(i).getLinkLocation().size(); // Get how many linkedLocation of this vertex
            Edge[] edges = new Edge[length];
            Set set = vertices.get(i).getLinkLocation().keySet();
            Iterator<Object> it = set.iterator();
            String currentKey = "";

            for (int q = 0; q < vertices.get(i).getLinkLocation().size(); q ++) {

                if (it.hasNext()) {
                    currentKey = it.next().toString(); // Get the locationId
                }
                    edges[q] = new Edge(IDMap.get(currentKey),
                            Double.parseDouble(vertices.get(i).getLinkLocation().get(currentKey)));
            }

            vertices.get(i).setAdjacency(edges); // set Edge[] to adjacency
        }


//        for(int i = 0; i < vertices.size(); i ++) {
//           Edge[] edge = vertices.get(i).adjacency;
//           System.out.println("!!!!!!!!!!!!"+ edge.length);
//        }

        IndoorMap map = new IndoorMap(new DjAlgorithm());
        map.setVertex(vertices);

        return map;

    }
}
