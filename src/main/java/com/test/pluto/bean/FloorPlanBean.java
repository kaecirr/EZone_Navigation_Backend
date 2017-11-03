package com.test.pluto.bean;

import javax.persistence.*;

/**
 * Created by captain on 2017/9/29.
 */
@Entity
@Table(name = "floorPlan", schema = "plutoDB", catalog = "")
public class FloorPlanBean {
    private String floorPlanId;
    private String buildingName;
    private Integer floorId;
    private String floorLevel;

    @Id
    @Column(name = "floorPlanId")
    public String getFloorPlanId() {
        return floorPlanId;
    }

    public void setFloorPlanId(String floorPlanId) {
        this.floorPlanId = floorPlanId;
    }

    @Basic
    @Column(name = "building_name")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Basic
    @Column(name = "floorId")
    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    @Basic
    @Column(name = "floor_level")
    public String getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FloorPlanBean that = (FloorPlanBean) o;

        if (floorPlanId != null ? !floorPlanId.equals(that.floorPlanId) : that.floorPlanId != null) return false;
        if (buildingName != null ? !buildingName.equals(that.buildingName) : that.buildingName != null) return false;
        if (floorId != null ? !floorId.equals(that.floorId) : that.floorId != null) return false;
        if (floorLevel != null ? !floorLevel.equals(that.floorLevel) : that.floorLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = floorPlanId != null ? floorPlanId.hashCode() : 0;
        result = 31 * result + (buildingName != null ? buildingName.hashCode() : 0);
        result = 31 * result + (floorId != null ? floorId.hashCode() : 0);
        result = 31 * result + (floorLevel != null ? floorLevel.hashCode() : 0);
        return result;
    }
}
