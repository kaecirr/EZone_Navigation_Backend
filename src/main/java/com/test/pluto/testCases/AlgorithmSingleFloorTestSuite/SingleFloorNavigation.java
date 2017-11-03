package com.test.pluto.testCases.AlgorithmSingleFloorTestSuite;

import com.test.pluto.entity.IndoorMap;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.*;
import com.test.pluto.entity.Vertex;
import com.test.pluto.algorithm.DjAlgorithm;

public class SingleFloorNavigation{
    //Declaration of variables
    private Vertex startingVertex;
    private Vertex destinationVertex;
    private DjAlgorithm algorithm;

    private TestAlgorithmDataSingle testAlgorithmDataSingle;

    //The Vertexes for testing
    //Second floor Vertexes
    private static Vertex CS0245;
    private static Vertex CS023A;
    private static Vertex CS0213;
    private static Vertex CS022C;
    private static Vertex CS023;
    private static Vertex CS021B;
    private static Vertex CS021;
    private static Vertex CS021E;
    private static Vertex CS024C;
    private static Vertex CS022E;
    private static Vertex CS0233;
    private static Vertex CS029;
    //First Floor Vertexes
    private static Vertex CS011;
    private static Vertex CS01C;
    private static Vertex CS0140;
    private static Vertex CS015;
    //Ground floor Vertexes
    private static Vertex CS001;
    private static Vertex CS009;
    private static Vertex CS0035;
    private static Vertex CS003D;
    private static Vertex CS013B;

    IndoorMap indoorMap = testAlgorithmDataSingle.getMapDataStructure("computerScience","second","DJ");

    @Before
    public void initialize() {
        algorithm = new DjAlgorithm();

        //testing single floor
        CS0245 = indoorMap.getVertex().get(60); //RightStairsDoor
        CS023A = indoorMap.getVertex().get(56); //2.07Door2
        CS0213 = indoorMap.getVertex().get(18); //2.10Door
        CS022C = indoorMap.getVertex().get(43); //RightCorridor5
        CS023 = indoorMap.getVertex().get(4); //MaleToiletDoor
        CS021B = indoorMap.getVertex().get(27); //2.12Door
        CS021 = indoorMap.getVertex().get(6); //MainEntrancetoSecondFloorDoor
        CS021E = indoorMap.getVertex().get(29); //2.14Door
        CS024C = indoorMap.getVertex().get(75); //LeftStair4
        CS022E = indoorMap.getVertex().get(44); //2.05Door1
        CS0233 = indoorMap.getVertex().get(51); //2.22Door
        CS029 = indoorMap.getVertex().get(8); //Room2.01Door2
        //First Floor Vertexes
        CS011 = indoorMap.getVertex().get(80); //MainEntranceToFirstFloor
        CS01C = indoorMap.getVertex().get(91); //RightCorridorDoor
        CS0140 = indoorMap.getVertex().get(92); //LeftStairDoor
        CS015 = indoorMap.getVertex().get(84); // SeminarRoom1.29Door1
        CS013B = indoorMap.getVertex().get(114); //LeftCorridor4
        //Ground floor Vertexes
        CS001 = indoorMap.getVertex().get(119); //MainEntranceToGroundFloor
        CS009 = indoorMap.getVertex().get(127); //RoomG.01Door
        CS0035 = indoorMap.getVertex().get(130); //RightCorrdior15
        CS003D = indoorMap.getVertex().get(138); // RoomG.17Door

        //multiple floors right stairs CS011, cS023||  CS015,CS021E ||CS021E, CS011 || CS01C, CS0035 || CS0035, CS01C
        //multiple floors left stairs CS001, CS0140|| CS0140,CS001 || CS0140,CS029 || CS029,CS0140
        //over 2 floors left stairs CS001,Cs023 || CS023, Cs001
        //over 2 floors right stiars CS023A,CS003D||CS003D,CS023A
    }


    @Test
    public void testStartLocationSingleFloor1(){
        startingVertex = CS023A;  //2.07Door2
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor2(){
        startingVertex = CS022C;  //RightCorridor5
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor2(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor3(){
        startingVertex = CS0213;  //Start: 2.10Door
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor3(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }
    @Test
    public void testStartLocationSingleFloor4(){
        startingVertex = CS023; //Start: MaleToiletDoor
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor4(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor5(){
        startingVertex = CS021B;   //Start: 2.12Door
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor5(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor6(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testStartLocationSingleFloor6(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor7(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS021E; //End: 2.14Door
        System.out.println("\n Inside testStartLocationSingleFloor7(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor8(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS024C ; //LeftStair4
        System.out.println("\n Inside testStartLocationSingleFloor8(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor9(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS022E; //2.05Door1
        System.out.println("\n Inside testStartLocationSingleFloor9(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor10(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0233; // 2.22Door
        System.out.println("\n Inside testStartLocationSingleFloor10(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    //first floor
    @Test
    public void testStartLocationSingleFloor11(){
        startingVertex = CS011; //MainEntranceToFirstFloor
        destinationVertex = CS01C; //RightCorridorDoor
        System.out.println("\n Inside testStartLocationSingleFloor11(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }
    @Test
    public void testStartLocationSingleFloor12(){
        startingVertex = CS011;  //MainEntranceToFirstFloor
        destinationVertex = CS015; // SeminarRoom1.29Door1
        System.out.println("\n Inside testStartLocationSingleFloor12(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor13(){
        startingVertex = CS015;  // SeminarRoom1.29Door1
        destinationVertex = CS011; //MainEntranceToFirstFloor
        System.out.println("\n Inside testStartLocationSingleFloor13(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    //floor0
    @Test
    public void testStartLocationSingleFloor14(){
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS009; //RoomG.01Door
        System.out.println("\n Inside testStartLocationSingleFloor14(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor15(){
        startingVertex = CS0035;//RightCorrdior15
        destinationVertex = CS003D; // RoomG.17Door
        System.out.println("\n Inside testStartLocationSingleFloor15(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationSingleFloor16(){
        startingVertex = CS009; //RoomG.01Door
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testStartLocationSingleFloor16(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    //Testing End Locations
    @Test
    public void testEndLocationsSingleFloor1(){
        startingVertex = CS023A;  //2.07Door2
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor2(){
        startingVertex = CS022C;  //RightCorridor5
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor2(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor3(){
        startingVertex = CS0213;  //Start: 2.10Door
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor3(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor4(){
        startingVertex = CS023; //Start: MaleToiletDoor
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor4(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor5(){
        startingVertex = CS021B;   //Start: 2.12Door
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor5(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor6(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0245; //RightStairsDoor
        System.out.println("\n Inside testEndLocationsSingleFloor6(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor7(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS021E; //End: 2.14Door
        System.out.println("\n Inside testEndLocationsSingleFloor7(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor8(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS024C ; //LeftStair4
        System.out.println("\n Inside testEndLocationsSingleFloor8(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor9(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS022E; //2.05Door1
        System.out.println("\n Inside testEndLocationsSingleFloor9(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsSingleFloor10(){
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0233; // 2.22Door
        System.out.println("\n Inside testEndLocationsSingleFloor10(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }

    @Test
    public void testPathFinding1() {
        startingVertex = CS023A; //Start: 2.07Door2
        destinationVertex = CS0245; //End: Right Stairs door

        System.out.println("\n Inside testPathFinding1(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.07Door2", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding2() {
        startingVertex = CS022C;  //RightCorridor5
        destinationVertex = CS0245; //RightStairsDoor

        System.out.println("\n Inside testPathFinding2(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding3() {
        startingVertex = CS0213;  //Start: 2.10Door
        destinationVertex = CS0245; //RightStairsDoor

        System.out.println("\n Inside testPathFinding3(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.10Door", "RightCorridor1", "RightCorridor2", "RightCorridor3", "RightCorridor4", "RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding4() {
        startingVertex = CS023; //Start: MaleToiletDoor
        destinationVertex = CS0245; //RightStairsDoor

        System.out.println("\n Inside testPathFinding4(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MaleToiletDoor", "LeftCorridor1", "LeftCorridor2", "LeftCorridor3", "LeftCorridor4", "LeftCorridor5", "LeftCorridor6", "HallwayDoor", "RightCorridor1", "RightCorridor2", "RightCorridor3","RightCorridor4", "RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding5() {
        startingVertex = CS021B;   //Start: 2.12Door
        destinationVertex = CS0245; //RightStairsDoor

        System.out.println("\n Inside testPathFinding5(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.12Door", "OfficeHallway1", "OfficeHallway2", "OfficeHallway3", "OfficeHallway4", "OfficeHallway5", "OfficeHallway6", "OfficeHallwayDoor2", "RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding6() {
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0245; //RightStairsDoor

        System.out.println("\n Inside testPathFinding6(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToSecondFloor", "LeftCorridor1", "LeftCorridor2", "LeftCorridor3", "LeftCorridor4", "LeftCorridor5", "LeftCorridor6", "HallwayDoor", "RightCorridor1", "RightCorridor2", "RightCorridor3", "RightCorridor4", "RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding7() {
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS021E; //End: 2.14Door

        System.out.println("\n Inside testPathFinding7(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToSecondFloor", "LeftCorridor1", "LeftCorridor2", "LeftCorridor3", "LeftCorridor4", "LeftCorridor5", "LeftCorridor6", "HallwayDoor", "RightCorridor1", "RightCorridor2", "OfficeHallwayDoor1", "OfficeHallway2", "OfficeHallway3", "Room2.14Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding8() {
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS024C ; //LeftStair4

        System.out.println("\n Inside testPathFinding8(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToSecondFloor", "LeftCorridor1", "LeftCorridor2", "LeftStairDoor", "LeftStair1", "LeftStair3", "LeftStair4"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding9() {
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS022E; //2.05Door1

        System.out.println("\n Inside testPathFinding9(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToSecondFloor", "LeftCorridor1", "LeftCorridor2", "LeftCorridor3", "LeftCorridor4", "LeftCorridor5", "LeftCorridor6", "HallwayDoor", "RightCorridor1", "RightCorridor2", "RightCorridor3", "RightCorridor4", "Room2.05Door1"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
    @Test
    public void testPathFinding10() {
        startingVertex = CS021;  //Start: MainEntranceToSecondFloorDoor
        destinationVertex = CS0233; // 2.22Door

        System.out.println("\n Inside testPathFinding10(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToSecondFloor", "LeftCorridor1", "LeftCorridor2", "LeftCorridor3", "LeftCorridor4", "LeftCorridor5", "LeftCorridor6", "HallwayDoor", "RightCorridor1", "RightCorridor2", "RightCorridor3", "RightCorridor4", "RightCorridor5", "RightCorridor6", "RightCorridor7", "Room2.22Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding11() {
        startingVertex = CS011; //MainEntranceToFirstFloor
        destinationVertex = CS01C; //RightCorridorDoor
        System.out.println("\n Inside testPathFinding11(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToFirstFloor", "Foyer1", "Foyer5", "Foyer4", "Foyer6", "RightCorridorDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding12() {
        startingVertex = CS011;  //MainEntranceToFirstFloor
        destinationVertex = CS015; // SeminarRoom1.29Door1

        System.out.println("\n Inside testPathFinding12(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToFirstFloor", "Foyer1", "Foyer2", "Foyer3", "SeminarRoom1.29Door1"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding13() {
        startingVertex = CS015;  // SeminarRoom1.29Door1
        destinationVertex = CS011; //MainEntranceToFirstFloor

        System.out.println("\n Inside testPathFinding13(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"SeminarRoom1.29Door1", "Foyer3", "Foyer2", "Foyer1", "MainEntranceToFirstFloor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding14() {
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS009; //RoomG.01Door

        System.out.println("\n Inside testPathFinding14(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToGroundFloor", "LeftCorridor1", "LeftCorridor2", "RoomG.01Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding15() {
        startingVertex = CS0035;//RightCorrdior15
        destinationVertex = CS003D; // RoomG.17Door

        System.out.println("\n Inside testPathFinding15(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RightCorridor15", "RightCorridor16", "RoomG.17Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }

    @Test
    public void testPathFinding16() {
        startingVertex = CS009; //RoomG.01Door
        destinationVertex = CS001; //MainEntranceToGroundFloor

        System.out.println("\n Inside testPathFinding16(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RoomG.01Door", "LeftCorridor2", "LeftCorridor1", "MainEntranceToGroundFloor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());

    }
}
