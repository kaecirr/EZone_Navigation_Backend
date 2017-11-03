package com.test.pluto.bean;

import javax.persistence.*;

/**
 * Created by captain on 2017/10/1.
 */
@Entity
@Table(name = "building", schema = "plutoDB", catalog = "")
public class BuildingBean {
    private int buildingId;
    private String buildingName;

    @Id
    @Column(name = "buildingId")
    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "building_name")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingBean that = (BuildingBean) o;

        if (buildingId != that.buildingId) return false;
        if (buildingName != null ? !buildingName.equals(that.buildingName) : that.buildingName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = buildingId;
        result = 31 * result + (buildingName != null ? buildingName.hashCode() : 0);
        return result;
    }
}
