package com.test.pluto.bean;

import javax.persistence.*;

/**
 * Created by captain on 2017/10/1.
 */
@Entity
@Table(name = "link", schema = "plutoDB", catalog = "")
@IdClass(LinkBeanPK.class)
public class LinkBean {
    private String locationId;
    private String linkId;
    private String distance;

    @Id
    @Column(name = "locationId")
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Id
    @Column(name = "linkId")
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "distance")
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkBean linkBean = (LinkBean) o;

        if (locationId != null ? !locationId.equals(linkBean.locationId) : linkBean.locationId != null) return false;
        if (linkId != null ? !linkId.equals(linkBean.linkId) : linkBean.linkId != null) return false;
        if (distance != null ? !distance.equals(linkBean.distance) : linkBean.distance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locationId != null ? locationId.hashCode() : 0;
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }
}
