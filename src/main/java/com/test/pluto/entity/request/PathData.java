package com.test.pluto.entity.request;

/**
 * Description: PathData in PathRequest, check PathRequest for more information
 *
 *==============================================================
 {
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
 * Created by captain on 2017/9/20.
 *
 * @author captain
 */
public class PathData {

    private String startBuildingName;
    private String startFloor;
    private String startLongitude;
    private String startLatitude;
    private String endBuildingName;
    private String endFloor;
    private String endLongitude;
    private String endLatitude;
    private String algorithm;

    public PathData(String startBuildingName, String startFloor, String startLongitude,
                          String startLatitude, String endBuildingName, String endFloor,
                          String endLongitude, String endLatitude,
                          String algorithm) {
        this.startBuildingName = startBuildingName;
        this.startFloor = startFloor;
        this.startLongitude = startLongitude;
        this.startLatitude = startLatitude;
        this.endBuildingName = endBuildingName;
        this.endFloor = endFloor;
        this.endLongitude = endLongitude;
        this.endLatitude = endLatitude;
        this.algorithm = algorithm;
    }

    public PathData() {
    }

    public String getStartBuildingName() {
        return startBuildingName;
    }

    public void setStartBuildingName(String startBuildingName) {
        this.startBuildingName = startBuildingName;
    }

    public String getStartFloor() {
        return startFloor;
    }

    public void setStartFloor(String startFloor) {
        this.startFloor = startFloor;
    }

    public String getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(String startLongitude) {
        this.startLongitude = startLongitude;
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    public String getEndBuildingName() {
        return endBuildingName;
    }

    public void setEndBuildingName(String endBuildingName) {
        this.endBuildingName = endBuildingName;
    }

    public String getEndFloor() {
        return endFloor;
    }

    public void setEndFloor(String endFloor) {
        this.endFloor = endFloor;
    }

    public String getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Description: Check parameters are empty or not, except algorithm.
     *              If algorithm is empty, the backend use default DJAlgorithm to
     *              calculate the shortest path.
     *
     * @return
     */
    public boolean isParametersValid(){
        if (!this.startBuildingName.isEmpty() && !this.startFloor.isEmpty() &&
                !this.startLongitude.isEmpty() && !this.startLatitude.isEmpty()
                && !this.endBuildingName.isEmpty() && !this.endFloor.isEmpty()
                && !this.endLongitude.isEmpty()
                && !this.endLatitude.isEmpty()) {

            return true;
        } else {

            return false;
        }
    }
}
