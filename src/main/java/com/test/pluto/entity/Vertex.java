package com.test.pluto.entity;

import java.util.HashMap;

/**
 * Description: The vertex in the graph
 *
 * @author Yuntian
 */
public class Vertex implements Comparable<Vertex> {

    public String buildingName;
    public String locationId;
    public String floorLevel;
    public String locationName;
    public Edge[] adjacency;
    public double longitude;
    public double latitude;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public HashMap<String, String> linkLocation = new HashMap<>();

    public Vertex() {
    }

    public Vertex(String locationName, Double latitude, Double longitude) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String toString(){
        return locationName;
    }

    public int compareTo(Vertex other){
        return Double.compare(minDistance, other.minDistance);
    }

    public HashMap<String, String> getLinkLocation() {
        return linkLocation;
    }

    public void setLinkLocation(HashMap<String, String> linkLocation) {
        this.linkLocation = linkLocation;
    }


    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Edge[] getAdjacency() {
        return adjacency;
    }

    public void setAdjacency(Edge[] adjacency) {
        this.adjacency = adjacency;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPrevious() {
        return previous;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }
}
