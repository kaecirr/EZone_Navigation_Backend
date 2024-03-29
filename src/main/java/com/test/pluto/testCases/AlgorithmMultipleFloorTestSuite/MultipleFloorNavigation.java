package com.test.pluto.testCases.AlgorithmMultipleFloorTestSuite;

import com.test.pluto.entity.IndoorMap;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.*;
import com.test.pluto.entity.Vertex;
import com.test.pluto.algorithm.DjAlgorithm;

public class MultipleFloorNavigation{
    //Declaration of variables
    private Vertex startingVertex;
    private Vertex destinationVertex;
    private DjAlgorithm algorithm;

    private TestAlgorithmDataMultiple testAlgorithmDataMultiple;

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

    IndoorMap indoorMap = TestAlgorithmDataMultiple.getMapDataStructure("computerScience","second","DJ");

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
    //RightStairs
    @Test
    public void testStartLocationMultipleFloors1(){
        startingVertex = CS011; //MainEntranceToFirstFloor
        destinationVertex = CS023; //MaleToiletFloor
        System.out.println("\n Inside testStartLocationMultipleFloors1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors2(){
        startingVertex = CS015; //SeminarRoom1.29Door1
        destinationVertex = CS021E; //Room2.14Door
        System.out.println("\n Inside testStartLocationMultipleFloors2(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors3(){
        startingVertex = CS021E; //Room2.14Door
        destinationVertex = CS011; //MainEntranceToFirstFloor
        System.out.println("\n Inside testStartLocationMultipleFloors3(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }


    @Test
    public void testStartLocationMultipleFloors4(){
        startingVertex = CS01C; //RightCorrdiorDoor
        destinationVertex = CS0035; //RightCorrdior15
        System.out.println("\n Inside testStartLocationMultipleFloors4(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors5(){
        startingVertex = CS0035; //RightCorridor15
        destinationVertex = CS01C; //RightCorridorDoor
        System.out.println("\n Inside testStartLocationMultipleFloors5(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors6(){
        startingVertex = CS023A; //Room2.07Door2
        destinationVertex = CS003D; //RoomG.17door
        System.out.println("\n Inside testStartLocationMultipleFloors6(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }
    @Test
    public void testStartLocationMultipleFloors7(){
        startingVertex = CS003D; //RoomG.17door
        destinationVertex = CS023A; //Room2.07Door2
        System.out.println("\n Inside testStartLocationMultipleFloors7): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }



    //Left Stairs
    @Test
    public void testStartLocationMultipleFloors8(){
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS013B; //LeftStairDoor
        System.out.println("\n Inside testStartLocationMultipleFloors8(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors9(){
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testStartLocationMultipleFloors9(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors10(){
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS029; //Room2.01Door2
        System.out.println("\n Inside testStartLocationMultipleFloors10(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors11(){
        startingVertex = CS029; //Room2.01Door2
        destinationVertex = CS0140; //LeftStairDoor
        System.out.println("\n Inside testStartLocationMultipleFloors11(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors12(){
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS023; //MaleToiletDoor
        System.out.println("\n Inside testStartLocationMultipleFloors12(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testStartLocationMultipleFloors13(){
        startingVertex = CS023; //MaleToiletDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testStartLocationMultipleFloors13(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the starting location is correct in the path returned
        System.out.println("Checking Correct Starting Location...");
        assertEquals(startingVertex, path.get(0));
    }

    @Test
    public void testEndLocationsMultipleFloor1(){
        startingVertex = CS011; //MainEntranceToFirstFloor
        destinationVertex = CS023; //MaleToiletFloor
        System.out.println("\n Inside testEndLocationsMultipleFloor1(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }

    @Test
    public void testEndLocationsMultipleFloor2(){
        startingVertex = CS015; //SeminarRoom1.29Door1
        destinationVertex = CS021E; //Room2.14Door
        System.out.println("\n Inside testEndLocationsMultipleFloor2(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }

    @Test
    public void testEndLocationsMultipleFloor3(){
        startingVertex = CS021E; //Room2.14Door
        destinationVertex = CS011; //MainEntranceToFirstFloor
        System.out.println("\n Inside testEndLocationsMultipleFloor3(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor4(){
        startingVertex = CS01C; //RightCorrdiorDoor
        destinationVertex = CS0035; //RightCorrdior15
        System.out.println("\n Inside testEndLocationsMultipleFloor4(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor5(){
        startingVertex = CS0035; //RightCorridor15
        destinationVertex = CS01C; //RightCorridorDoor
        System.out.println("\n Inside testEndLocationsMultipleFloor5(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor6(){
        startingVertex = CS023A; //Room2.07Door2
        destinationVertex = CS003D; //RoomG.17door
        System.out.println("\n Inside testEndLocationsMultipleFloor6(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor7(){
        startingVertex = CS003D; //RoomG.17door
        destinationVertex = CS023A; //Room2.07Door2
        System.out.println("\n Inside testEndLocationsMultipleFloor7(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor8(){
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS0140; //LeftStairDoor
        System.out.println("\n Inside testEndLocationsMultipleFloor8(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor9(){
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testEndLocationsMultipleFloor9(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor10(){
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS029; //Room2.01Door2
        System.out.println("\n Inside testEndLocationsMultipleFloor10(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor11(){
        startingVertex = CS029; //Room2.01Door2
        destinationVertex = CS0140; //LeftStairDoor
        System.out.println("\n Inside testEndLocationsMultipleFloor11(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor12(){
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS023; //MaleToiletDoor
        System.out.println("\n Inside testEndLocationsMultipleFloor12(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }
    @Test
    public void testEndLocationsMultipleFloor13(){
        startingVertex = CS023; //MaleToiletDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testEndLocationsMultipleFloor13(): "+ "Start: " + startingVertex + ", End: " + destinationVertex + "\n");
        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        //Check to see if the destination is correct in the path returned
        System.out.println("Checking Correct Destination Location...");
        assertEquals(destinationVertex, path.get(path.size() - 1));
    }

    @Test
    public void testPathFinding17() {
        startingVertex = CS011; //MainEntranceToFirstFloor
        destinationVertex = CS023; //MaleToiletFloor
        System.out.println("\n Inside testPathFinding17(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToFirstFloor", "Foyer1", "Foyer5", "Foyer4", "RightStairDoor", "RightStair5", "RightStairLinkFirst-Second", "RightStairLinkSecond-First", "RightStair3", "RightStair2", "RightStair1", "RightStairDoor", "RightCorridor11", "RightCorridor10", "RightCorridor9", "RightCorridor8", "RightCorridor7", "RightCorridor6", "RightCorridor5", "RightCorridor4", "RightCorridor3", "RightCorridor2", "RightCorridor1", "HallwayDoor", "LeftCorridor6", "LeftCorridor5", "LeftCorridor4", "LeftCorridor3", "LeftCorridor2", "LeftCorridor1", "MaleToiletDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding18() {
        startingVertex = CS015; //SeminarRoom1.29Door1
        destinationVertex = CS021E; //Room2.14Door
        System.out.println("\n Inside testPathFinding18(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"SeminarRoom1.29Door1", "Foyer3", "Foyer5", "Foyer4", "RightStairDoor", "RightStair5", "RightStairLinkFirst-Second", "RightStairLinkSecond-First", "RightStair3", "RightStair2", "RightStair1", "RightStairDoor", "RightCorridor11", "RightCorridor10", "RightCorridor9", "RightCorridor8", "RightCorridor7", "RightCorridor6", "RightCorridor5", "OfficeHallwayDoor2", "OfficeHallway6", "OfficeHallway5", "OfficeHallway4", "OfficeHallway3", "Room2.14Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding19() {
        startingVertex = CS021E; //Room2.14Door
        destinationVertex = CS011; //MainEntranceToFirstFloor
        System.out.println("\n Inside testPathFinding19(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.14Door", "OfficeHallway3", "OfficeHallway4", "OfficeHallway5", "OfficeHallway6", "OfficeHallwayDoor2", "RightCorridor5", "RightCorridor6", "RightCorridor7", "RightCorridor8", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor", "RightStair1", "RightStair2", "RightStair3", "RightStairLinkSecond-First", "RightStairLinkFirst-Second", "RightStair5", "RightStairDoor", "Foyer4", "Foyer5", "Foyer1", "MainEntranceToFirstFloor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding20() {
        startingVertex = CS01C; //RightCorrdiorDoor
        destinationVertex = CS0035; //RightCorrdior15
        System.out.println("\n Inside testPathFinding20(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RightCorridorDoor", "Foyer6", "Foyer4", "RightStairDoor", "RightStair1", "RightStair2", "RightStair3", "RightStair4", "RightStairLinkFirst-Ground", "RightStairLinkGround-First", "RightStair2", "RightStair1", "RightStairDoor", "RightCorridor16", "RightCorridor15"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding21() {
        startingVertex = CS0035; //RightCorridor15
        destinationVertex = CS01C; //RightCorridorDoor
        System.out.println("\n Inside testPathFinding21(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RightCorridor15", "RightCorridor16", "RightStairDoor", "RightStair1", "RightStair2", "RightStairLinkGround-First", "RightStairLinkFirst-Ground", "RightStair4", "RightStair3", "RightStair2", "RightStair1", "RightStairDoor", "Foyer4", "Foyer6", "RightCorridorDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding22() {
        startingVertex = CS023A; //Room2.07Door2
        destinationVertex = CS003D; //RoomG.17door
        System.out.println("\n Inside testPathFinding22(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.07Door2", "RightCorridor9", "RightCorridor10", "RightCorridor11", "RightStairDoor", "RightStair1", "RightStair2", "RightStair3", "RightStairLinkSecond-First", "RightStairLinkFirst-Second", "RightStair5", "RightStair1", "RightStair2", "RightStair3", "RightStair4", "RightStairLinkFirst-Ground", "RightStairLinkGround-First", "RightStair2", "RightStair1", "RightStairDoor", "RightCorridor16", "RoomG.17Door"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding23() {
        startingVertex = CS003D; //RoomG.17door
        destinationVertex = CS023A; //Room2.07Door2
        System.out.println("\n Inside testPathFinding23(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"RoomG.17Door", "RightCorridor16", "RightStairDoor", "RightStair1", "RightStair2", "RightStairLinkGround-First", "RightStairLinkFirst-Ground", "RightStair4", "RightStair3", "RightStair2", "RightStair1", "RightStair5", "RightStairLinkFirst-Second", "RightStairLinkSecond-First", "RightStair3", "RightStair2", "RightStair1", "RightStairDoor", "RightCorridor11", "RightCorridor10", "RightCorridor9", "Room2.07Door2"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding24() {
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS013B; //LeftCorridor4
        System.out.println("\n Inside testPathFinding24(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToGroundFloor", "LeftCorridor1", "LeftCorridor2", "LeftStairDoor", "LeftStair", "LeftStairLinkGround-First", "LeftStairLinkFirst-Ground", "LeftStair6", "LeftStair5", "LeftStair4", "LeftStair1", "LeftStairDoor", "LeftCorridor4"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding25() {
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testPathFinding25(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"LeftStairDoor", "LeftStair1", "LeftStair4", "LeftStair5", "LeftStair6", "LeftStairLinkFirst-Ground", "LeftStairLinkGround-First", "LeftStair", "LeftStairDoor", "LeftCorridor2", "LeftCorridor1", "MainEntranceToGroundFloor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding26() {
        startingVertex = CS0140; //LeftStairDoor
        destinationVertex = CS029; //Room2.01Door2
        System.out.println("\n Inside testPathFinding26(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"LeftStairDoor", "LeftStair1", "LeftStair2", "LeftStair3", "LeftStairLinkFirst-Second", "LeftStairLinkSecond-First", "LeftStair5", "LeftStair4", "LeftStair3", "LeftStair1", "LeftStairDoor", "LeftCorridor2", "LeftCorridor3", "Room2.01Door2"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }


    @Test
    public void testPathFinding27() {
        startingVertex = CS029; //Room2.01Door2
        destinationVertex = CS0140; //LeftStairDoor
        System.out.println("\n Inside testPathFinding27(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"Room2.01Door2", "LeftCorridor3", "LeftCorridor2", "LeftStairDoor", "LeftStair1", "LeftStair3", "LeftStair4", "LeftStair5", "LeftStairLinkSecond-First", "LeftStairLinkFirst-Second", "LeftStair3", "LeftStair2", "LeftStair1", "LeftStairDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding28() {
        startingVertex = CS001; //MainEntranceToGroundFloor
        destinationVertex = CS023; //MaleToiletDoor
        System.out.println("\n Inside testPathFinding28(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MainEntranceToGroundFloor", "LeftCorridor1", "LeftCorridor2", "LeftStairDoor", "LeftStair", "LeftStairLinkGround-First", "LeftStairLinkFirst-Ground", "LeftStair6", "LeftStair5", "LeftStair4", "LeftStair1", "LeftStair2", "LeftStair3", "LeftStairLinkFirst-Second", "LeftStairLinkSecond-First", "LeftStair5", "LeftStair4", "LeftStair3", "LeftStair1", "LeftStairDoor", "LeftCorridor2", "LeftCorridor1", "MaleToiletDoor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }

    @Test
    public void testPathFinding29() {
        startingVertex = CS023; //MaleToiletDoor
        destinationVertex = CS001; //MainEntranceToGroundFloor
        System.out.println("\n Inside testPathFinding29(): " + "Start: " + startingVertex + ", End: " + destinationVertex + "\n");

        algorithm.createGraph(startingVertex,destinationVertex);
        List<Vertex> path = algorithm.getShortestPathTo(destinationVertex);

        System.out.println(path);

        String[] pathList = new String[] {"MaleToiletDoor", "LeftCorridor1", "LeftCorridor2", "LeftStairDoor", "LeftStair1", "LeftStair3", "LeftStair4", "LeftStair5", "LeftStairLinkSecond-First", "LeftStairLinkFirst-Second", "LeftStair3", "LeftStair2", "LeftStair1", "LeftStair4", "LeftStair5", "LeftStair6", "LeftStairLinkFirst-Ground", "LeftStairLinkGround-First", "LeftStair", "LeftStairDoor", "LeftCorridor2", "LeftCorridor1", "MainEntranceToGroundFloor"};
        //Check to see if the path is the same
        System.out.println("Checking Correct shortest Path...");
        assertEquals(Arrays.toString(pathList),path.toString());
    }
}
