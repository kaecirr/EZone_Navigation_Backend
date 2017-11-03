package com.test.pluto.bean;

import javax.persistence.*;

/**
 * Created by captain on 2017/10/1.
 */
@Entity
@Table(name = "floor", schema = "plutoDB", catalog = "")
public class FloorBean {
    private int floorId;
    private Integer buildingId;
    private String floorLevel;

    @Id
    @Column(name = "floorId")
    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    @Basic
    @Column(name = "buildingId")
    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
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

        FloorBean floorBean = (FloorBean) o;

        if (floorId != floorBean.floorId) return false;
        if (buildingId != null ? !buildingId.equals(floorBean.buildingId) : floorBean.buildingId != null) return false;
        if (floorLevel != null ? !floorLevel.equals(floorBean.floorLevel) : floorBean.floorLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = floorId;
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        result = 31 * result + (floorLevel != null ? floorLevel.hashCode() : 0);
        return result;
    }
}
