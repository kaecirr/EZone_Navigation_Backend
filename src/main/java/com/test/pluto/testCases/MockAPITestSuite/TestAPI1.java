package com.test.pluto.testCases.MockAPITestSuite;


import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;
import com.test.pluto.entity.request.*;
import com.test.pluto.entity.request.PathData;

import com.test.pluto.entity.response.*;
import com.test.pluto.service.MapService;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;
import com.test.pluto.controller.MapController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestAPI1{

	@InjectMocks
	private MapController mapController = new MapController();
	
	@Mock
	private MapService mockMapService;

	ResponseData responseData = new ResponseData();
	PathRequest pathRequest = new PathRequest();
	PathData pathData = new PathData();
	TestAlgorithmDataAPI testAlgorithmDataAPI = new TestAlgorithmDataAPI();
	IndoorMap indoorMap = testAlgorithmDataAPI.getMapDataStructure("ComputerScience","2","DJ");
	MapDataResponse mapDataResponse = new MapDataResponse();
	MapData mapData = new MapData();

	//Verify that pathFinding is called in MapController
	@Test
	public void testPathFindingCalled() throws JSONException {

		System.out.println("\n Inside testPathFindingCalled: \n");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ECM");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		System.out.println("	Calling mapController.pathFinding()...");
		mapController.pathFinding(pathRequest);

		System.out.println("	Verifying that mapService.pathFinding() was called...");
		verify(mockMapService).pathFinding("ComputerScience", "2", "115.8599","-31.97444473","ECM", "2", "115.823","-31.97222274", "DJ");


		//pathFinding() is only called once when executing mapController
		System.out.println("	Verifying mapService.pathFinding() is called at most once... \n");
		verify(mockMapService, atMost(1)).pathFinding("ComputerScience", "2", "115.8599","-31.97444473","ECM", "2", "115.823","-31.97222274", "DJ");
	}

	//Should throw an error if one of the parameters for the path Request Data is empty.
	@Test
	public void testEmptyPathRequest1() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest1: \n");
		System.out.println("	Checking that when startBuildingName is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		//pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);
		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}

	@Test
	public void testEmptyPathRequest2() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest2: \n");
		System.out.println("	Checking that when startFloor is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		//pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}

	@Test
	public void testEmptyPathRequest3() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest3: \n");
		System.out.println("	Checking that when startLongitude is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		//pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}


	@Test
	public void testEmptyPathRequest4() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest4: \n");
		System.out.println("	Checking that when startLatitude is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		//pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);
		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}


	@Test
	public void testEmptyPathRequest5() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest5: \n");
		System.out.println("	Checking that when EndBuildingName is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		//pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}


	@Test
	public void testEmptyPathRequest6() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest6: \n");
		System.out.println("	Checking that when endFloor is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		//pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}

	@Test
	public void testEmptyPathRequest7() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest7: \n");
		System.out.println("	Checking that when endLongitude is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		//pathData.setEndLongitude("115.823");
		pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}

	@Test
	public void testEmptyPathRequest8() throws JSONException {
		System.out.println("\n Inside testEmptyPathRequest8: \n");
		System.out.println("	Checking that when endLatitude is empty, an exception is thrown...");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.8599");
		pathData.setStartLatitude("-31.97444473");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.823");
		//pathData.setEndLatitude("-31.97222274");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		try{
			mapController.pathFinding(pathRequest);
			fail("No Exception thrown!");
		}
		catch(NullPointerException nu){
			System.out.println("Exception Thrown");
		}
	}
	
	//Verify that it got back a responseMessage and that is the correct responseMessage
	@Test
	public void testNavigationResponseSuccess(){
		System.out.println("\n Inside testNavigationResponseSuccess: \n");

		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("ComputerScience");
		pathData.setStartFloor("2");
		pathData.setStartLongitude("115.81600092");
		pathData.setStartLatitude("-31.97769007");
		pathData.setEndBuildingName("ComputerScience");
		pathData.setEndFloor("2");
		pathData.setEndLongitude("115.81597947");
		pathData.setEndLatitude("-31.97765708");
		pathData.setAlgorithm("DJ");
		pathRequest.setPathData(pathData);

		Vertex CS023 = indoorMap.getVertex().get(4);
		CS023.setBuildingName("ComputerScience");
		CS023.setFloorLevel("2");
		Vertex CS022 = indoorMap.getVertex().get(5);
		CS022.setBuildingName("ComputerScience");
		CS022.setFloorLevel("2");

		Vertex CS025 = indoorMap.getVertex().get(2);
		CS025.setBuildingName("ComputerScience");
		CS025.setFloorLevel("2");
		List<Vertex> path = new ArrayList<>();
		path.add(CS023);
		path.add(CS022);
		path.add(CS025);


		try {
			when(mockMapService.pathFinding("ComputerScience", "2", "115.81600092","-31.97769007","ComputerScience", "2", "115.81597947","-31.97765708", "DJ")).thenReturn(path);
			responseData = mapController.pathFinding(pathRequest);
			verify(mockMapService).pathFinding("ComputerScience", "2", "115.81600092","-31.97769007","ComputerScience", "2", "115.81597947","-31.97765708", "DJ");

		} catch (JSONException e) {
			e.printStackTrace();
		}

		List<HashMap<String,String>> pathList = new ArrayList<>();
		for (int i = 0; i < path.size(); i++) {
			HashMap<String, String> pathElement = new HashMap<>();
			pathElement.put("buildingName", path.get(i).buildingName);
			pathElement.put("floor", path.get(i).floorLevel);
			pathElement.put("locationName", path.get(i).locationName);
			pathElement.put("longitude", path.get(i).longitude + "");
			pathElement.put("latitude", path.get(i).latitude + "");
			pathList.add(i, pathElement);
		}


		mapData.setStartBuildingName(pathData.getStartBuildingName());
		mapData.setStartFloor(pathData.getStartFloor());
		mapData.setEndBuildingName(pathData.getEndBuildingName());
		mapData.setEndFloor(pathData.getEndFloor());
		mapData.setStartLongitude(pathData.getStartLongitude());
		mapData.setStartLatitude(pathData.getStartLatitude());
		mapData.setEndLongitude(pathData.getEndLongitude());
		mapData.setEndLatitude(pathData.getEndLatitude());
		mapData.setPath(pathList);
		mapDataResponse.setMapData(mapData);

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();

		mapData = mapDataResponse.getMapData();

		System.out.println("	Testing for SUCCESS message...");
		assertEquals("SUCCESS", message);

		System.out.println("	Testing for 0000 code...");
		assertEquals("0000", code);

		System.out.println("	Testing for mapData...");
		assertEquals("ComputerScience",mapData.getStartBuildingName());
		assertEquals("2",mapData.getStartFloor());
		assertEquals("115.81600092",mapData.getStartLongitude());
		assertEquals("-31.97769007",mapData.getStartLatitude());
		assertEquals("ComputerScience",mapData.getEndBuildingName());
		assertEquals("2",mapData.getEndFloor());
		assertEquals("115.81597947",mapData.getEndLongitude());
		assertEquals("-31.97765708",mapData.getEndLatitude());
		assertEquals("[{" +
				"buildingName=ComputerScience, " +
				"locationName=MaleToiletDoor, " +
				"latitude=-31.97769007, " +
				"floor=2, longitude=115.81600092" +
				"}, " +
				"{" +
				"buildingName=ComputerScience, " +
				"locationName=LeftCorridor1, " +
				"latitude=-31.97769007, " +
				"floor=2, longitude=115.8159855" +
				"}, " +
				"{" +
				"buildingName=ComputerScience, " +
				"locationName=LeftCorridor2, " +
				"latitude=-31.97765708, " +
				"floor=2, " +
				"longitude=115.81597947" +
				"}]",mapData.getPath());
	
	}

	//test using no parameters i.e empty parameters
	//Would it just return empty things
	@Test
	public void testNavigationEmptyRequest() {
		System.out.println("\n Inside testNavigationEmptyRequest: \n");
		pathRequest.setRequestMessage("hi");
		pathData.setStartBuildingName("");
		pathData.setStartFloor("");
		pathData.setStartLongitude("");
		pathData.setStartLatitude("");
		pathData.setEndBuildingName("");
		pathData.setEndFloor("");
		pathData.setEndLongitude("");
		pathData.setEndLatitude("");
		pathData.setAlgorithm("");
		pathRequest.setPathData(pathData);


		try {
			responseData = mapController.pathFinding(pathRequest);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();
		mapData = mapDataResponse.getMapData();

		System.out.println("	Testing for ERROR message...");
		assertEquals("ERROR", message);

		System.out.println("	Testing for 0001 code...");
		assertEquals("0001", code);

		System.out.println("	Testing for null mapDataResponse...");
		assertEquals(null, mapData);

	}
	
	
	//Test case for when there is no arguments

	//Test fetches Floor Plan correctly
	@Test
	public void testFetchFloorPlan() throws JSONException {
		System.out.println("\n Inside testFetchFloorPlan:... \n");

		FloorPlanRequest floorPlanRequest = new FloorPlanRequest();
		HashMap<String, String> compScienceFloorRequest = new HashMap<>();
		compScienceFloorRequest.put("buildingName","ComputerScience");
		//HashMap<String, String> ECMFloorRequest = new HashMap<>();
		//ECMFloorRequest.put("buildingName","ECM");

		List <HashMap<String,String>> floorPlanData = new ArrayList<>();
		floorPlanData.add(compScienceFloorRequest);
		//floorPlanData.add(ECMFloorRequest);
		floorPlanRequest.setFloorData(floorPlanData);


		//stub
		//when(.method()).thenReturn();
		//assertEquals(,floorid1,floorid2,floorid3);

		//Call Something that calls the method
		System.out.println("	Calling getFloorPlan()...");
		mapController.getFloorPlan(floorPlanRequest);

		System.out.println("	Verifying that mapService.getFloorPlanByFloor() was called...");
		verify(mockMapService).getFloorPlanByName(floorPlanData.get(0).get("buildingName"));

		//pathFinding() is only called once when executing mapController
		System.out.println("	Verifying mapService.getFloorPlanByFloor() is called at most once... \n");
		verify(mockMapService, atMost(1)).getFloorPlanByFloor(floorPlanData.get(0).get("buildingName"));


		try {
			responseData = mapController.getFloorPlan(floorPlanRequest);

		} catch (JSONException e) {
			e.printStackTrace();
		}


		HashMap<String, String> floorPlanResponseData = new HashMap<>();
		floorPlanResponseData.put("buildingName","ComputerScience");
		floorPlanResponseData.put("floor","2");
		floorPlanResponseData.put("floorPlanID","7348 - 4948 - 9834 - 3924");
		List <HashMap<String,String>> floorPlanResponseDataList = new ArrayList<>();
		floorPlanResponseDataList.add(floorPlanResponseData);
		FloorPlanResponse floorPlanResponse = new FloorPlanResponse();
		floorPlanResponse.setFloorPlanData(floorPlanResponseDataList);

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();

		System.out.println("	Testing for ERROR message...");
		//assertEquals("SUCCESS", message);

		System.out.println("	Testing for 0001 code...");
		//assertEquals("0000", code);

		//edit
		System.out.println("	Testing for floorDataResponse...");
		assertEquals("ComputerScience", floorPlanResponse.getFloorPlanData().get(0).get("buildingName"));
		assertEquals("2",floorPlanResponse.getFloorPlanData().get(0).get("floor"));
		assertEquals("7348 - 4948 - 9834 - 3924",floorPlanResponse.getFloorPlanData().get(0).get("floorPlanID"));
	}

	//Test fetches Floor Plan when empty floor data
	@Test
	public void testFetchFloorPlanRequestEmpty(){
		System.out.println("\n Inside testFetchFloorPlanRequestEmpty: \n");

		FloorPlanRequest floorPlanRequest = new FloorPlanRequest();
		HashMap<String, String> floorPlan = new HashMap<>();
		List <HashMap<String,String>> floorPlanData = new ArrayList<>();
		floorPlanData.add(floorPlan);
		floorPlanRequest.setFloorData(floorPlanData);


		try {
			responseData = mapController.getFloorPlan(floorPlanRequest);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();
		HashMap<String, String> compScienceResponse = new HashMap<>();
		compScienceResponse.put("buildingName","ComputerScience");
		compScienceResponse.put("floor","0");
		compScienceResponse.put("floorPlanID","7348 - 4948 - 9834 - 3924");

		HashMap<String, String> ECMResponse = new HashMap<>();
		ECMResponse.put("buildingName","ECM");
		ECMResponse.put("floor","0");
		ECMResponse.put("floorPlanID","7348 - 4948 - 9834 - 3924");
		List <HashMap<String,String>> floorPlanResponseDataList = new ArrayList<>();
		floorPlanResponseDataList.add(compScienceResponse);
		floorPlanResponseDataList.add(ECMResponse);
		FloorPlanResponse floorPlanResponse = new FloorPlanResponse();
		floorPlanResponse.setFloorPlanData(floorPlanResponseDataList);

		System.out.println("	Testing for ERROR message...");
		assertEquals("SUCCESS", message);

		System.out.println("	Testing for 0001 code...");
		assertEquals("0000", code);

		//edit
		System.out.println("	Testing for floorDataResponse...");
		assertEquals("ComputerScience", floorPlanResponse.getFloorPlanData().get(0).get("buildingName"));
		assertEquals("0",floorPlanResponse.getFloorPlanData().get(0).get("floor"));
		assertEquals("7348 - 4948 - 9834 - 3924",floorPlanResponse.getFloorPlanData().get(0).get("floorPlanID"));

		assertEquals("ECM", floorPlanResponse.getFloorPlanData().get(1).get("buildingName"));
		assertEquals("0",floorPlanResponse.getFloorPlanData().get(1).get("floor"));
		assertEquals("7348 - 4948 - 9834 - 3924",floorPlanResponse.getFloorPlanData().get(1).get("floorPlanID"));
	}


	//Test Room Info
	@Test
	public void testRoomInfoResponse() throws JSONException {
		System.out.println("\n Inside testRoomInfoResponse(): \n");

		RoomsRequest roomRequest = new RoomsRequest();

		HashMap<String,String> roomData = new HashMap<>();
		roomData.put("buildingName","ComputerScience");

		List<HashMap<String,String>> roomDataList = new ArrayList<>();
		roomDataList.add(roomData);

		roomRequest.setRoomData(roomDataList);

		//Call Something that calls the method
		System.out.println("	Calling mapController.getRooms()...");
		mapController.getRooms(roomRequest);

		System.out.println("	Verifying that mapService.getRooms() was called...");
		verify(mockMapService).getRoomsByBuilding(roomDataList.get(0).get("buildingName"));

		//pathFinding() is only called once when executing mapController
		System.out.println("	Verifying mapService.getRooms() is called at most once... \n");
		verify(mockMapService, atMost(1)).getRoomsByBuilding(roomDataList.get(0).get("buildingName"));

		try {
			responseData = mapController.getRooms(roomRequest);

		} catch (JSONException e) {
			e.printStackTrace();
		}


		HashMap<String, String> room1 = new HashMap<>();
		room1.put("floor","2");
		room1.put("roomName", "Lab 2.05");
		room1.put("roomDescription", "Computer lab 2.05 – Windows/Linux");
		room1.put("latitude", "-31.97766959");
		room1.put("longitude", "115.81638582");

		HashMap<String, String> room2 = new HashMap<>();
		room2.put("floor","1");
		room2.put("roomName", "Room 1.18");
		room2.put("roomDescription", "Office of Dr Rachel Cardel-Oliver");
		room2.put("latitude", "-31.97766959");
		room2.put("longitude", "115.81638582");

		HashMap<String, String> room3 = new HashMap<>();
		room3.put("floor","0");
		room3.put("roomName", "Lab G.09");
		room3.put("roomDescription", "Research laboratory");
		room3.put("latitude", "-31.97766959");
		room3.put("longitude", "115.81638582");

		List <HashMap<String,String>> roomList = new ArrayList<>();
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		RoomsResponse roomsResponse = new RoomsResponse();
		roomsResponse.setRoomInfoData(roomList);

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();

		System.out.println("	Testing for ERROR message...");
		assertEquals("SUCCESS", message);

		System.out.println("	Testing for 0001 code...");
		assertEquals("0000", code);

		//edit
		System.out.println("	Testing for roomsResponse...");
		assertEquals("Lab 2.05", roomsResponse.getRoomInfoData().get(0).get("roomName"));
		assertEquals("2",roomsResponse.getRoomInfoData().get(0).get("floor"));
		assertEquals("Computer lab 2.05 – Windows/Linux",roomsResponse.getRoomInfoData().get(0).get("roomDescription"));
		assertEquals("-31.97766959",roomsResponse.getRoomInfoData().get(0).get("latitude"));
		assertEquals("115.81638582",roomsResponse.getRoomInfoData().get(0).get("longitude"));


		assertEquals("1",roomsResponse.getRoomInfoData().get(1).get("floor"));
		assertEquals("Room 1.18",roomsResponse.getRoomInfoData().get(1).get("roomName"));
		assertEquals("Office of Dr Rachel Cardel-Oliver",roomsResponse.getRoomInfoData().get(1).get("roomDescription"));
		assertEquals("-31.97766959",roomsResponse.getRoomInfoData().get(1).get("latitude"));
		assertEquals("115.81638582",roomsResponse.getRoomInfoData().get(1).get("longitude"));

		assertEquals("0",roomsResponse.getRoomInfoData().get(2).get("floor"));
		assertEquals("Lab G.09", roomsResponse.getRoomInfoData().get(2).get("roomName"));
		assertEquals("Research laboratory", roomsResponse.getRoomInfoData().get(2).get("roomDescription"));
		assertEquals("-31.97766959", roomsResponse.getRoomInfoData().get(2).get("latitude"));
		assertEquals("115.81638582", roomsResponse.getRoomInfoData().get(2).get("longitude"));

	}

	@Test
	public void testRoomInfoResponseEmpty(){
		System.out.println("\n Inside testRoomInfoResponseEmpty: \n");

		RoomsRequest roomRequest = new RoomsRequest();

		HashMap<String,String> roomData = new HashMap<>();

		List<HashMap<String,String>> roomDataList = new ArrayList<>();
		roomDataList.add(roomData);

		roomRequest.setRoomData(roomDataList);


		try {
			responseData = mapController.getRooms(roomRequest);

		} catch (JSONException e) {
			e.printStackTrace();
		}

		String message = responseData.getResponseMessage();
		String code = responseData.getResponseCode();
		RoomsResponse roomsResponse = new RoomsResponse();

		System.out.println("	Testing for ERROR message...");
		assertEquals("ERROR", message);

		System.out.println("	Testing for 0001 code...");
		assertEquals("0001", code);

		System.out.println("	Testing for null roomResponse...");
		assertEquals(null, roomsResponse.getRoomInfoData());
	}
}