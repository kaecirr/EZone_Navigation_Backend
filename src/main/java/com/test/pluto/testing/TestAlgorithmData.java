package com.test.pluto.testing;

import com.test.pluto.algorithm.DjAlgorithm;
import com.test.pluto.entity.Edge;
import com.test.pluto.entity.IndoorMap;
import com.test.pluto.entity.Vertex;

import java.util.List;
import java.util.ArrayList;

public class TestAlgorithmData {
	public static IndoorMap getMapDataStructure(String building, String floor, String algorithm){
	
	IndoorMap map = new IndoorMap(new DjAlgorithm());
    map.setBuilding(building);
    map.setFloor(floor);

	
	//floor 2 Vertices
		Vertex CS027 = new Vertex("Room2.01Door1", -31.97764570, 115.81598014);
		Vertex CS026 = new Vertex("LeftStairDoor", -31.97765765, 115.81596203);
		Vertex CS025 = new Vertex("LeftCorridor2", -31.97765708, 115.81597947);
		Vertex CS024 = new Vertex("MaleToilets", -31.97770656, 115.81601433);
		Vertex CS023 = new Vertex("MaleToiletDoor", -31.97769007, 115.81600092);
		Vertex CS022 = new Vertex("LeftCorridor1", -31.97769007, 115.81598550);
		Vertex CS021 = new Vertex("MainEntranceToSecondFloor", -31.97774297, 115.81598550);
		Vertex CS028 = new Vertex("LeftCorridor3", -31.97765708, 115.81601635);
		Vertex CS029 = new Vertex("Room2.01Door2", -31.97764513, 115.81601702);
		Vertex CS02A = new Vertex("Room2.01", -31.97758939, 115.81598014);
		Vertex CS02B = new Vertex("LeftCorridor4", -31.97765651, 115.81604317);
		Vertex CS02C = new Vertex("CleanerRoomDoor", -31.97767187, 115.81604317);
		Vertex CS02D = new Vertex("LeftCorridor5", -31.97765651, 115.81606060);
		Vertex CS0211 = new Vertex("HallwayDoor", -31.97765423, 115.81607603);
		Vertex CS0210 = new Vertex("FemaleToiletDoor", -31.97767130, 115.81606999);
		Vertex CS02E = new Vertex("Room2.03Door1", -31.97764627, 115.81605993);
		Vertex CS02F = new Vertex("LeftCorridor6", -31.97765651, 115.81606999);
		Vertex CS0212 = new Vertex("RightCorridor1", -31.97765708, 115.81609011);
		Vertex CS0213 = new Vertex("Room2.10Door", -31.97767187, 115.81609011);
		Vertex CS0215 = new Vertex("RightCorridor2", -31.97765708, 115.81611693);
		Vertex CS0219 = new Vertex("OfficeHallwayDoor1", -31.97767187, 115.81611693);
		Vertex CS0216 = new Vertex("RightCorridor3", -31.97765708, 115.81613034);
		Vertex CS0217 = new Vertex("Room2.03Door2", -31.97764513, 115.81612967);
		Vertex CS0218 = new Vertex("Room2.03", -31.97758768, 115.81609480);
		Vertex CS0214 = new Vertex("Room2.10", -31.97768609, 115.81609011);
		Vertex CS021C = new Vertex("OfficeHallway2", -31.97768722, 115.81611760);
		Vertex CS021A = new Vertex("OfficeHallway1", -31.97768722, 115.81610754);
		Vertex CS021B = new Vertex("Room2.12Door", -31.97769576, 115.81610754);
		Vertex CS021D = new Vertex("OfficeHallway3", -31.97768722, 115.81613973);
		Vertex CS021E = new Vertex("Room2.14Door", -31.97769519, 115.81613973);
		Vertex CS021F = new Vertex("OfficeHallway4", -31.97768722, 115.81617728);
		Vertex CS0220 = new Vertex("Room2.16Door", -31.97769519, 115.81617728);
		Vertex CS0221 = new Vertex("OfficeHallway5", -31.97768666, 115.81621617);
		Vertex CS0222 = new Vertex("Room2.18Door", -31.97769519, 115.81621684);
		Vertex CS0223 = new Vertex("OfficeHallway6", -31.97768609, 115.81623830);
		Vertex CS0224 = new Vertex("Room2.20Door", -31.97769519, 115.81623830);
		Vertex CS0225 = new Vertex("OfficeHallwayDoor2", -31.97767244, 115.81623897);
		Vertex CS0229 = new Vertex("Room2.16", -31.97771737, 115.81617527);
		Vertex CS0228 = new Vertex("Room2.14", -31.97771794, 115.81613705);
		Vertex CS0227 = new Vertex("Room2.12", -31.97771680, 115.81609681);
		Vertex CS022A = new Vertex("Room2.18", -31.97771794, 115.81621349);
		Vertex CS022B = new Vertex("Room2.20", -31.97771737, 115.81625238);
		Vertex CS0226 = new Vertex("FemaleToilets", -31.97770599, 115.81606798);
		Vertex CS022C = new Vertex("RightCorridor5", -31.97765765, 115.81623897);
		Vertex CS022E = new Vertex("Room2.05Door1", -31.97764513, 115.81617795);
		Vertex CS022D = new Vertex("RightCorridor4", -31.97765708, 115.81617862);
		Vertex CS022F = new Vertex("Room2.05", -31.97758768, 115.81621081);
		Vertex CS0230 = new Vertex("Room2.05Door2", -31.97764456, 115.81624769);
		Vertex CS0231 = new Vertex("RightCorridor6", -31.97765765, 115.81624836);
		Vertex CS0234 = new Vertex("Room2.22", -31.97768324, 115.81625775);
		Vertex CS0232 = new Vertex("RightCorridor7", -31.97765765, 115.81625640);
		Vertex CS0233 = new Vertex("Room2.22Door", -31.97766959, 115.81625573);
		Vertex CS0235 = new Vertex("RightCorridor8", -31.97765708, 115.81629127);
		Vertex CS0238 = new Vertex("Room2.07Door1", -31.97764513, 115.81629060);
		Vertex CS0236 = new Vertex("Room2.24Door", -31.97767016, 115.81629463);
		Vertex CS023B = new Vertex("RightCorridor9", -31.97765708, 115.81636101);
		Vertex CS023A = new Vertex("Room2.07Door2", -31.97764456, 115.81636101);
		Vertex CS023C = new Vertex("RightCorridor10", -31.97765765, 115.81637643);
		Vertex CS023D = new Vertex("Room2.09Door", -31.97765935, 115.81638649);
		Vertex CS0240 = new Vertex("Room2.28Door", -31.97768154, 115.81639186);
		Vertex CS0245 = new Vertex("RightStairDoor", -31.97768950, 115.81637979);
		Vertex CS0243 = new Vertex("Room2.26Door", -31.97768210, 115.81634089);
		Vertex CS0239 = new Vertex("Room2.07", -31.97758768, 115.81632413);
		Vertex CS023E = new Vertex("Room2.09", -31.97761214, 115.81642471);
		Vertex CS0241 = new Vertex("Room2.28", -31.97770429, 115.81642739);
		Vertex CS0237 = new Vertex("Room2.24", -31.97770486, 115.81628926);
		Vertex CS0244 = new Vertex("Room2.26", -31.97770486, 115.81632547);
		Vertex CS023F = new Vertex("RightCorridor11", -31.97768154, 115.81637979);
		Vertex CS0242 = new Vertex("RightCorridor12", -31.97768210, 115.81636034);
		Vertex CS0246 = new Vertex("RightStair1", -31.97770201, 115.81637911);
		Vertex CS0247 = new Vertex("RightStair2", -31.97773102, 115.81637979);
		Vertex CS0248 = new Vertex("RightStair3", -31.97773159, 115.81635296);
		Vertex CS0249 = new Vertex("RightStairLinkSecond-First", -31.97770258, 115.81635229);
		Vertex CS024A = new Vertex("LeftStair1", -31.97765765, 115.81595264);
		Vertex CS024B = new Vertex("LeftStair3", -31.97767983, 115.81595331);
		Vertex CS024C = new Vertex("LeftStair4", -31.97770998, 115.81595331);
		Vertex CS024D = new Vertex("LeftStair5", -31.97770941, 115.81593387);
		Vertex CS024E = new Vertex("LeftStairLinkSecond-First", -31.97769234, 115.81593320);
		Vertex CS024F = new Vertex("LeftStairLinkSecond-Top", -31.97768097, 115.81593320);
		Vertex CS0250 = new Vertex("LeftStair2", -31.97765765, 115.81593320);


		//floor 1 vertices
		Vertex CS011 = new Vertex("MainEntranceToFirstFloor", -31.97758996, 115.81637107);
		Vertex CS012 = new Vertex("Foyer1", -31.97761840, 115.81637107);
		Vertex CS013 = new Vertex("Foyer2", -31.97761783, 115.81639521);
		Vertex CS014 = new Vertex("Foyer3", -31.97764001, 115.81639521);
		Vertex CS015 = new Vertex("SeminarRoom1.29Door1", -31.97764911, 115.81639521);
		Vertex CS016 = new Vertex("SeminarRoom1.29", -31.97769064, 115.81639521);
		Vertex CS017 = new Vertex("Seminar1.29Door2", -31.97766675, 115.81636302);
		Vertex CS018 = new Vertex("Foyer4", -31.97766675, 115.81634827);
		Vertex CS019 = new Vertex("Foyer5", -31.97764058, 115.81634827);
		Vertex CS01A = new Vertex("ReceptionDoor", -31.97763774, 115.81632815);
		Vertex CS01B = new Vertex("Foyer6", -31.97766675, 115.81632882);
		Vertex CS01C = new Vertex("RightCorridorDoor", -31.97766675, 115.81631675);
		Vertex CS0137 = new Vertex("MaleToilets", -31.97770998, 115.81601366);
		Vertex CS0138 = new Vertex("MaleToiletDoor", -31.97770543, 115.81599623);
		Vertex CS0139 = new Vertex("StoreRoomDoor", -31.97769519, 115.81599623);
		Vertex CS013A = new Vertex("LeftCorridor3", -31.97766447, 115.81597745);
		Vertex CS013B = new Vertex("LeftCorridor4", -31.97766390, 115.81596605);
		Vertex CS013C = new Vertex("LeftCorridor5", -31.97769462, 115.81597611);
		Vertex CS013D = new Vertex("LeftCorridor6", -31.97770656, 115.81597678);
		Vertex CS013E = new Vertex("LeftCorridor7", -31.97773045, 115.81597812);
		Vertex CS013F = new Vertex("LeftSideEntrance", -31.97774240, 115.81598215);
		Vertex CS0140 = new Vertex("LeftStairDoor", -31.97766390, 115.81595868);
		Vertex CS0141 = new Vertex("DoorBetween1.01And1.11", -31.97765310, 115.81596538);
		Vertex CS0142 = new Vertex("LeftStair1", -31.97766447, 115.81595063);
		Vertex CS0143 = new Vertex("LeftStair2", -31.97766447, 115.81593186);
		Vertex CS0144 = new Vertex("LeftStair3", -31.97767812, 115.81593186);
		Vertex CS0145 = new Vertex("LeftStairLinkFirst-Second", -31.97769576, 115.81593253);
		Vertex CS0146 = new Vertex("LeftStair4", -31.97768381, 115.81595063);
		Vertex CS0147 = new Vertex("LeftStair5", -31.97770998, 115.81595130);
		Vertex CS0148 = new Vertex("LeftStair6", -31.97770998, 115.81593320);
		Vertex CS0149 = new Vertex("RightStairDoor", -31.97767755, 115.81634961);
		Vertex CS014A = new Vertex("RightStair1", -31.97769121, 115.81635229);
		Vertex CS014B = new Vertex("RightStair2", -31.97771054, 115.81635229);
		Vertex CS014C = new Vertex("RightStair3", -31.97771111, 115.81634089);
		Vertex CS014D = new Vertex("RightStair4", -31.97771111, 115.81632815);
		Vertex CS014E = new Vertex("RightStairLinkFirst-Ground", -31.97770088, 115.81632815);
		Vertex CS014F = new Vertex("RightStairLinkFirst-Second", -31.97769291, 115.81632748);
		Vertex CS0150 = new Vertex("RightStair5", -31.97768779, 115.81634022);
		Vertex CS0151 = new Vertex("LeftStairLinkFirst-Ground", -31.97769576, 115.81593253);

		//ground floor vertices
		Vertex CS001 = new Vertex("MainEntranceToGroundFloor", -31.97771908, 115.81600964);
		Vertex CS002 = new Vertex("LeftCorridor1", -31.97770884, 115.81600562);
		Vertex CS003 = new Vertex("CleanerRoomDoor", -31.97770884, 115.81598684);
		Vertex CS004 = new Vertex("CleanerRoom", -31.97771111, 115.81596941);
		Vertex CS005 = new Vertex("LeftStairLinkGround-First", -31.97769348, 115.81596002);
		Vertex CS006 = new Vertex("LeftStair", -31.97766447, 115.81595935);
		Vertex CS007 = new Vertex("LeftStairDoor", -31.97766447, 115.81598550);
		Vertex CS008 = new Vertex("LeftCorridor2", -31.97767073, 115.81600629);
		Vertex CS009 = new Vertex("RoomG.01Door", -31.97765594, 115.81599958);
		Vertex CS00A = new Vertex("MaleToiletDoor", -31.97765594, 115.81601299);
		Vertex CS00B = new Vertex("CorridorDoor", -31.97767073, 115.81601903);
		Vertex CS0035 = new Vertex("RightCorridor15", -31.97766561, 115.81634089);
		Vertex CS0036 = new Vertex("RoomG.15Door", -31.97765651, 115.81634022);
		Vertex CS0037 = new Vertex("RoomG.15", -31.97763888, 115.81635766);
		Vertex CS0038 = new Vertex("RightCorridor16", -31.97766504, 115.81638180);
		Vertex CS0039 = new Vertex("RightStairDoor", -31.97767244, 115.81638247);
		Vertex CS003A = new Vertex("RightStair1", -31.97768438, 115.81638180);
		Vertex CS003B = new Vertex("RightStair2", -31.97768552, 115.81633888);
		Vertex CS003C = new Vertex("RightStairLinkGround-First", -31.97769746, 115.81633955);
		Vertex CS003D = new Vertex("RoomG.17Door", -31.97766504, 115.81639521);
		Vertex CS003E = new Vertex("RoomG.17", -31.97763433, 115.81641600);


		//initialize the edges
		CS027.adjacency = new Edge[]{
				new Edge(CS025,1.3),
				new Edge(CS02A,6.3)
		};
		CS026.adjacency = new Edge[]{
				new Edge(CS025,1.6),
				new Edge(CS024A,0.9)
		};
		CS025.adjacency = new Edge[]{
				new Edge(CS026,1.6),
				new Edge(CS027,1.3),
				new Edge(CS022,3.7),
				new Edge(CS028,3.5)
		};
		CS024.adjacency = new Edge[]{
				new Edge(CS023,2.2)
		};
		CS023.adjacency = new Edge[]{
				new Edge(CS024,2.2),
				new Edge(CS022,1.5)
		};
		CS022.adjacency = new Edge[]{
				new Edge(CS023,1.5),
				new Edge(CS025,3.7),
				new Edge(CS021,5.9)
		};
		CS021.adjacency = new Edge[]{
				new Edge(CS022,5.9)
		};
		CS028.adjacency = new Edge[]{
				new Edge(CS025,3.5),
				new Edge(CS029,1.3),
				new Edge(CS02B,2.5)
		};
		CS029.adjacency = new Edge[]{
				new Edge(CS028,1.3),
				new Edge(CS02A,7.1)
		};
		CS02A.adjacency = new Edge[]{
				new Edge(CS027,6.3),
				new Edge(CS029,7.1)
		};
		CS02B.adjacency = new Edge[]{
				new Edge(CS028,2.5),
				new Edge(CS02C,1.7),
				new Edge(CS02D,1.6)
		};
		CS02C.adjacency = new Edge[]{
				new Edge(CS02B,1.7)
		};
		CS02D.adjacency = new Edge[]{
				new Edge(CS02B,1.6),
				new Edge(CS02E,1.1),
				new Edge(CS02F,0.9)
		};
		CS0211.adjacency = new Edge[]{
				new Edge(CS02F,0.6),
				new Edge(CS0212,1.4)
		};
		CS0210.adjacency = new Edge[]{
				new Edge(CS02F,1.6),
				new Edge(CS0226,3.9)
		};
		CS02E.adjacency = new Edge[]{
				new Edge(CS02D,1.1),
				new Edge(CS0218,7.3)
		};
		CS02F.adjacency = new Edge[]{
				new Edge(CS02D,0.9),
				new Edge(CS0210,1.6),
				new Edge(CS0211,0.6)
		};
		CS0212.adjacency = new Edge[]{
				new Edge(CS0211,1.4),
				new Edge(CS0213,1.6),
				new Edge(CS0215,2.5)
		};
		CS0213.adjacency = new Edge[]{
				new Edge(CS0212,1.6),
				new Edge(CS0214,1.6)
		};
		CS0215.adjacency = new Edge[]{
				new Edge(CS0212,2.5),
				new Edge(CS0219,1.6),
				new Edge(CS0216,1.3)
		};
		CS0219.adjacency = new Edge[]{
				new Edge(CS0215,1.6),
				new Edge(CS021C,1.7)
		};
		CS0216.adjacency = new Edge[]{
				new Edge(CS0215,1.3),
				new Edge(CS0217,1.3),
				new Edge(CS022D,4.6)
		};
		CS0217.adjacency = new Edge[]{
				new Edge(CS0216,1.3),
				new Edge(CS0218,7.2)
		};
		CS0218.adjacency = new Edge[]{
				new Edge(CS022E,7.3),
				new Edge(CS0217,7.2)
		};
		CS0214.adjacency = new Edge[]{
				new Edge(CS0213,1.6)
		};
		CS021C.adjacency = new Edge[]{
				new Edge(CS0219,1.7),
				new Edge(CS021A,0.9),
				new Edge(CS021D,2.1)
		};
		CS021A.adjacency = new Edge[]{
				new Edge(CS021B,0.9),
				new Edge(CS021C,0.9)
		};
		CS021B.adjacency = new Edge[]{
				new Edge(CS021A,0.9),
				new Edge(CS0227,2.6)
		};
		CS021D.adjacency = new Edge[]{
				new Edge(CS021C,2.1),
				new Edge(CS021E,0.9),
				new Edge(CS021F,3.5)
		};
		CS021E.adjacency = new Edge[]{
				new Edge(CS021D,0.9),
				new Edge(CS0228,2.5)
		};
		CS021F.adjacency = new Edge[]{
				new Edge(CS021D,3.5),
				new Edge(CS0220,0.9),
				new Edge(CS0221,3.7)
		};
		CS0220.adjacency = new Edge[]{
				new Edge(CS021F,0.9),
				new Edge(CS0229,2.5)
		};
		CS0221.adjacency = new Edge[]{
				new Edge(CS021F,3.7),
				new Edge(CS0222,0.9),
				new Edge(CS0223,2.1)
		};
		CS0222.adjacency = new Edge[]{
				new Edge(CS022A,2.6)
		};
		CS0223.adjacency = new Edge[]{
				new Edge(CS0221,2.1),
				new Edge(CS0224,0.9),
				new Edge(CS0225,1.5)
		};
		CS0224.adjacency = new Edge[]{
				new Edge(CS0223,0.9),
				new Edge(CS022B,2.8)
		};
		CS0225.adjacency = new Edge[]{
				new Edge(CS0223,1.5),
				new Edge(CS022C,1.6)
		};
		CS0229.adjacency = new Edge[]{
				new Edge(CS0220,2.5)
		};
		CS0228.adjacency = new Edge[]{
				new Edge(CS021E,2.5)
		};
		CS0227.adjacency = new Edge[]{
				new Edge(CS021B,2.6)
		};
		CS022A.adjacency = new Edge[]{
				new Edge(CS0222,2.6)
		};
		CS022B.adjacency = new Edge[]{
				new Edge(CS0224,2.8)
		};
		CS0226.adjacency = new Edge[]{
				new Edge(CS0210,3.9)
		};
		CS022C.adjacency = new Edge[]{
				new Edge(CS0225,1.6),
				new Edge(CS0231,0.9),
				new Edge(CS022D,5.7)
		};
		CS022E.adjacency = new Edge[]{
				new Edge(CS022D,1.3),
				new Edge(CS022F,7.1)
		};
		CS022D.adjacency = new Edge[]{
				new Edge(CS022E,1.3),
				new Edge(CS0216,4.6),
				new Edge(CS022C,5.7)
		};
		CS022F.adjacency = new Edge[]{
				new Edge(CS022E,7.1),
				new Edge(CS0230,7.2)
		};
		CS0230.adjacency = new Edge[]{
				new Edge(CS0231,1.5),
				new Edge(CS022F,7.2)
		};
		CS0231.adjacency = new Edge[]{
				new Edge(CS0230,1.5),
				new Edge(CS022C,0.9),
				new Edge(CS0232,0.8)
		};
		CS0234.adjacency = new Edge[]{
				new Edge(CS0233,1.5)
		};
		CS0232.adjacency = new Edge[]{
				new Edge(CS0231,0.8),
				new Edge(CS0233,1.3),
				new Edge(CS0235,3.3)
		};
		CS0233.adjacency = new Edge[]{
				new Edge(CS0234,1.5),
				new Edge(CS0232,1.3)
		};
		CS0235.adjacency = new Edge[]{
				new Edge(CS0232,3.3),
				new Edge(CS0236,1.5),
				new Edge(CS0238,1.3),
				new Edge(CS023B,6.6)
		};
		CS0238.adjacency = new Edge[]{
				new Edge(CS0235,1.3),
				new Edge(CS0239,7.1)
		};
		CS0236.adjacency = new Edge[]{
				new Edge(CS0235,1.5),
				new Edge(CS0237,3.9)
		};
		CS023B.adjacency = new Edge[]{
				new Edge(CS0235,6.6),
				new Edge(CS023A,1.4),
				new Edge(CS023C,1.5),
				new Edge(CS0242,2.8)
		};
		CS023A.adjacency = new Edge[]{
				new Edge(CS023B,1.4),
				new Edge(CS0239,7.2)
		};
		CS023C.adjacency = new Edge[]{
				new Edge(CS023B,1.5),
				new Edge(CS023D,1),
				new Edge(CS023F,2.7)
		};
		CS023D.adjacency = new Edge[]{
				new Edge(CS023C,1),
				new Edge(CS023E,6.4)
		};
		CS0240.adjacency = new Edge[]{
				new Edge(CS0241,4.2),
				new Edge(CS023F,1.1)
		};
		CS0245.adjacency = new Edge[]{
				new Edge(CS023F,0.9),
				new Edge(CS0246,1.4)
		};
		CS0243.adjacency = new Edge[]{
				new Edge(CS0242,1.8),
				new Edge(CS0244,2.9)
		};
		CS0239.adjacency = new Edge[]{
				new Edge(CS0238,7.1),
				new Edge(CS023A,7.2)
		};
		CS023E.adjacency = new Edge[]{
				new Edge(CS023D,6.4)
		};
		CS0241.adjacency = new Edge[]{
				new Edge(CS0240,4.2)
		};
		CS0237.adjacency = new Edge[]{
				new Edge(CS0236,3.9)
		};
		CS0244.adjacency = new Edge[]{
				new Edge(CS0243,2.9)
		};
		CS023F.adjacency = new Edge[]{
				new Edge(CS023C,2.7),
				new Edge(CS0242,1.8),
				new Edge(CS0240,1.1),
				new Edge(CS0245,0.9)
		};
		CS0242.adjacency = new Edge[]{
				new Edge(CS0243,1.8),
				new Edge(CS023B,2.8),
				new Edge(CS023F,1.8)
		};
		CS0246.adjacency = new Edge[]{
				new Edge(CS0247,3.2),
				new Edge(CS0245,1.4)
		};
		CS0247.adjacency = new Edge[]{
				new Edge(CS0246,3.2),
				new Edge(CS0248,2.5)
		};
		CS0248.adjacency = new Edge[]{
				new Edge(CS0247,2.5),
				new Edge(CS0249,3.2)
		};
		CS0249.adjacency = new Edge[]{
				new Edge(CS0248,3.2),
				new Edge(CS014F,0)
		};
		CS024A.adjacency = new Edge[]{
				new Edge(CS026,0.9),
				new Edge(CS0250,1.8),
				new Edge(CS024B,2.5)
		};
		CS024B.adjacency = new Edge[]{
				new Edge(CS024A,2.5),
				new Edge(CS024C,3.4)
		};
		CS024C.adjacency = new Edge[]{
				new Edge(CS024D,1.8),
				new Edge(CS024B,3.4)
		};
		CS024D.adjacency = new Edge[]{
				new Edge(CS024C,1.8),
				new Edge(CS024E,1.9)
		};
		CS024E.adjacency = new Edge[]{
				new Edge(CS024D,1.9),
				new Edge(CS0145,0)
		};
		CS024F.adjacency = new Edge[]{
				new Edge(CS0250,1.8)
		};
			
		CS0250.adjacency = new Edge[]{
				new Edge(CS024F,1.8),
				new Edge(CS024A,1.8)
		};
	
	//initialize 1st floor edges
		CS011.adjacency = new Edge[]{
				new Edge(CS012,3.2)
		};
		CS012.adjacency = new Edge[]{
				new Edge(CS013,2.3),
				new Edge(CS019,3.3),
				new Edge(CS011,3.2)
		};
		CS013.adjacency = new Edge[]{
				new Edge(CS012,2.3),
				new Edge(CS014,2.5)
		};
		CS014.adjacency = new Edge[]{
				new Edge(CS013,2.5),
				new Edge(CS015,1),
				new Edge(CS019,4.4)
		};
		CS015.adjacency = new Edge[]{
				new Edge(CS014,1),
				new Edge(CS016,4.6)
		};
		CS016.adjacency = new Edge[]{
				new Edge(CS015,4.6),
				new Edge(CS017,4)
		};
		CS017.adjacency = new Edge[]{
				new Edge(CS016,4),
				new Edge(CS018,1.4)
		};
		CS018.adjacency = new Edge[]{
				new Edge(CS017,1.4),
				new Edge(CS019,2.9),
				new Edge(CS01B,1.8),
				new Edge(CS0149,1.2)
		};
		CS019.adjacency = new Edge[]{
				new Edge(CS018,2.9),
				new Edge(CS014,4.4),
				new Edge(CS012,3.3),
				new Edge(CS01A,1.9)
		};
		CS01A.adjacency = new Edge[]{
				new Edge(CS019,1.9),
				new Edge(CS01B,3.2)
		};
		CS01B.adjacency = new Edge[]{
				new Edge(CS01A,3.2),
				new Edge(CS018,1.8),
				new Edge(CS01C,1.1)
		};
		CS01C.adjacency = new Edge[]{
				new Edge(CS01B,1.1),
		};
		CS0149.adjacency = new Edge[]{
				new Edge(CS018,1.2),
				new Edge(CS014A,1.5),
				new Edge(CS0150,1.4)
		};
		CS014A.adjacency = new Edge[]{
				new Edge(CS0149,1.5),
				new Edge(CS0150,1.2),
				new Edge(CS014B,2.2)
		};
		CS014B.adjacency = new Edge[]{
				new Edge(CS014A,2.2),
				new Edge(CS014C,1.1)
		};
		CS014C.adjacency = new Edge[]{
				new Edge(CS014B,1.1),
				new Edge(CS014D,1.2)
		};
		CS014D.adjacency = new Edge[]{
				new Edge(CS014C,1.2),
				new Edge(CS014E,1.1)
		};
		CS014E.adjacency = new Edge[]{
				new Edge(CS014D,1.1),
				new Edge(CS003C,0)
		};
		CS014F.adjacency = new Edge[]{
				new Edge(CS0150,1.3),
				new Edge(CS0249,0)
		};
		CS0150.adjacency = new Edge[]{
				new Edge(CS014F,1.3),
				new Edge(CS014A,1.2),
				new Edge(CS0149,1.4)
		};
		CS0151.adjacency = new Edge[]{
				new Edge(CS0148,1.6),
				new Edge(CS005,0)
		};
		CS0140.adjacency = new Edge[]{
				new Edge(CS013B,0.7),
				new Edge(CS0142,0.8)
		};
		CS0141.adjacency = new Edge[]{
				
		};
		CS0142.adjacency = new Edge[]{
				new Edge(CS0140,0.8),
				new Edge(CS0146,2.2),
				new Edge(CS0143,1.8)
		};
		CS0143.adjacency = new Edge[]{
				new Edge(CS0144,1.5),
				new Edge(CS0142,1.8)
		};
		CS0144.adjacency = new Edge[]{
				new Edge(CS0143,1.5),
				new Edge(CS0145,2)
		};
		CS0145.adjacency = new Edge[]{
				new Edge(CS0144,2),
				new Edge(CS024E,0)
		};
		CS0146.adjacency = new Edge[]{
				new Edge(CS0142,2.2),
				new Edge(CS0147,2.9)
		};
		CS0147.adjacency = new Edge[]{
				new Edge(CS0148,1.7),
				new Edge(CS0146,2.9)
		};
		CS0148.adjacency = new Edge[]{
				new Edge(CS0151,1.6),
				new Edge(CS0147,1.7)
		};
		CS0137.adjacency = new Edge[]{
				new Edge(CS0138,1.7)
		};
		CS0138.adjacency = new Edge[]{
				new Edge(CS0137,1.7),
				new Edge(CS013D,1.8)
		};
		CS0139.adjacency = new Edge[]{
				new Edge(CS013C,1.9)
		};
		CS013A.adjacency = new Edge[]{
				new Edge(CS013C,3.4),
				new Edge(CS013B,1.1)
		};
		CS013B.adjacency = new Edge[]{
				new Edge(CS013A,1.1),
				new Edge(CS0140,0.7),
				new Edge(CS0141,1.2)
		};
		CS013C.adjacency = new Edge[]{
				new Edge(CS013A,3.4),
				new Edge(CS0139,1.9),
				new Edge(CS013D,1.3)
		};
		CS013D.adjacency = new Edge[]{
				new Edge(CS013C,1.3),
				new Edge(CS013E,2.7),
				new Edge(CS0138,1.8)
		};
		CS013E.adjacency = new Edge[]{
				new Edge(CS013F,1.4),
				new Edge(CS013D,2.7)
		};
		CS013F.adjacency = new Edge[]{
				new Edge(CS013E,1.4)
		};

		
		
		
		//initialize floor 0 edges
		CS001.adjacency = new Edge[]{
				new Edge(CS002,1.2)
		};
		CS002.adjacency = new Edge[]{
				new Edge(CS001,1.2),
				new Edge(CS003,1.8),
				new Edge(CS008,4.2)
		};
		CS003.adjacency = new Edge[]{
				new Edge(CS002,1.8),
				new Edge(CS004,1.7)
		};
		CS004.adjacency = new Edge[]{
				new Edge(CS003,1.7)
		};
		CS005.adjacency = new Edge[]{
				new Edge(CS006,3.2),
				new Edge(CS0151,0)
		};
		CS006.adjacency = new Edge[]{
				new Edge(CS005,3.2),
				new Edge(CS007,2.5)
		};
		CS007.adjacency = new Edge[]{
				new Edge(CS006,2.5),
				new Edge(CS008,2.1),
				new Edge(CS009,1.6)
		};
		CS008.adjacency = new Edge[]{
				new Edge(CS002,4.2),
				new Edge(CS007,2.1),
				new Edge(CS009,1.8),
				new Edge(CS00A,1.8),
				new Edge(CS00B,1.2)
		};
		CS009.adjacency = new Edge[]{
				new Edge(CS008,1.8),
				new Edge(CS007,1.6),
				
		};
		CS00A.adjacency = new Edge[]{
				
				new Edge(CS008,1.8),
				new Edge(CS00B,1.7)
		};
		CS00B.adjacency = new Edge[]{
				new Edge(CS00A,1.7),
				new Edge(CS008,1.2),
				
		};
		CS0035.adjacency = new Edge[]{
				
				new Edge(CS0036,1),
				new Edge(CS0038,3.9)
		};
		CS0036.adjacency = new Edge[]{
				new Edge(CS0035,1),
				new Edge(CS0037,2.6)
		};
		CS0037.adjacency = new Edge[]{
				new Edge(CS0036,2.6)
		};
		CS0038.adjacency = new Edge[]{
				new Edge(CS0035,3.9),
				new Edge(CS0039,0.8),
				new Edge(CS003D,1.3)
		};
		CS0039.adjacency = new Edge[]{
				new Edge(CS0038,0.8),
				new Edge(CS003A,1.3)
		};
		CS003A.adjacency = new Edge[]{
				new Edge(CS0039,1.3),
				new Edge(CS003B,4)
		};
		CS003B.adjacency = new Edge[]{
				new Edge(CS003A,4),
				new Edge(CS003C,1.3)
		};
		CS003C.adjacency = new Edge[]{
				new Edge(CS003B,1.3),
				new Edge(CS014E,0)
		};
		CS003D.adjacency = new Edge[]{
				new Edge(CS0038,1.3),
				new Edge(CS003E,3.9)
		};
		CS003E.adjacency = new Edge[]{
				new Edge(CS003D,3.9)
		};

	
	
		List<Vertex> vertices = new ArrayList<>();
		vertices.add(CS027);
		vertices.add(CS026);
		vertices.add(CS025);
		vertices.add(CS024);
		vertices.add(CS023);
		vertices.add(CS022);
		vertices.add(CS021);
		vertices.add(CS028);
		vertices.add(CS029);
		vertices.add(CS02A);
		vertices.add(CS02B);
		vertices.add(CS02C);
		vertices.add(CS02D);
		vertices.add(CS0211);
		vertices.add(CS0210);
		vertices.add(CS02E);
		vertices.add(CS02F);
		vertices.add(CS0212);
		vertices.add(CS0213);
		vertices.add(CS0215);
		vertices.add(CS0219);
		vertices.add(CS0216);
		vertices.add(CS0217);
		vertices.add(CS0218);
		vertices.add(CS0214);
		vertices.add(CS021C);
		vertices.add(CS021A);
		vertices.add(CS021B);
		vertices.add(CS021D);
		vertices.add(CS021E);
		vertices.add(CS021F);
		vertices.add(CS0220);
		vertices.add(CS0221);
		vertices.add(CS0222);
		vertices.add(CS0223);
		vertices.add(CS0224);
		vertices.add(CS0225);
		vertices.add(CS0229);
		vertices.add(CS0228);
		vertices.add(CS0227);
		vertices.add(CS022A);
		vertices.add(CS022B);
		vertices.add(CS0226);
		vertices.add(CS022C);
		vertices.add(CS022E);
		vertices.add(CS022D);
		vertices.add(CS022F);
		vertices.add(CS0230);
		vertices.add(CS0231);
		vertices.add(CS0234);
		vertices.add(CS0232);
		vertices.add(CS0233);
		vertices.add(CS0235);
		vertices.add(CS0238);
		vertices.add(CS0236);
		vertices.add(CS023B);
		vertices.add(CS023A);
		vertices.add(CS023C);
		vertices.add(CS023D);
		vertices.add(CS0240);
		vertices.add(CS0245);
		vertices.add(CS0243);
		vertices.add(CS0239);
		vertices.add(CS023E);
		vertices.add(CS0241);
		vertices.add(CS0237);
		vertices.add(CS0244);
		vertices.add(CS023F);
		vertices.add(CS0242);
		vertices.add(CS0246);
		vertices.add(CS0247);
		vertices.add(CS0248);
		vertices.add(CS0249);
		vertices.add(CS024A);
		vertices.add(CS024B);
		vertices.add(CS024C);
		vertices.add(CS024D);
		vertices.add(CS024E);
		vertices.add(CS024F);
		vertices.add(CS0250);
	
		//floor 1
		vertices.add(CS011);
		vertices.add(CS012);
		vertices.add(CS013);
		vertices.add(CS014);
		vertices.add(CS015);
		vertices.add(CS016);
		vertices.add(CS017);
		vertices.add(CS018);
		vertices.add(CS019);
		vertices.add(CS01A);
		vertices.add(CS01B);
		vertices.add(CS01C);
		vertices.add(CS0140);
		vertices.add(CS0141);
		vertices.add(CS0142);
		vertices.add(CS0143);
		vertices.add(CS0144);
		vertices.add(CS0145);
		vertices.add(CS0146);
		vertices.add(CS0147);
		vertices.add(CS0148);
		vertices.add(CS0149);
		vertices.add(CS014A);
		vertices.add(CS014B);
		vertices.add(CS014C);
		vertices.add(CS014D);
		vertices.add(CS014E);
		vertices.add(CS014F);
		vertices.add(CS0150);
		vertices.add(CS0151);
		vertices.add(CS0137);
		vertices.add(CS0138);
		vertices.add(CS0139);
		vertices.add(CS013A);
		vertices.add(CS013B);
		vertices.add(CS013C);
		vertices.add(CS013D);
		vertices.add(CS013E);
		vertices.add(CS013F);

		//floor 0
		vertices.add(CS001);
		vertices.add(CS002);
		vertices.add(CS003);
		vertices.add(CS004);
		vertices.add(CS005);
		vertices.add(CS006);
		vertices.add(CS007);
		vertices.add(CS008);
		vertices.add(CS009);
		vertices.add(CS00A);
		vertices.add(CS00B);
		vertices.add(CS0035);
		vertices.add(CS0036);
		vertices.add(CS0037);
		vertices.add(CS0038);
		vertices.add(CS0039);
		vertices.add(CS003A);
		vertices.add(CS003B);
		vertices.add(CS003C);
		vertices.add(CS003D);
		vertices.add(CS003E);
	

	
	
	map.setVertex(vertices);
    return map;
	}
}