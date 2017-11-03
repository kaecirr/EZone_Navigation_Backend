package com.test.pluto.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by captain on 2017/10/1.
 */
public class LinkBeanPK implements Serializable {
    private String locationId;
    private String linkId;

    @Column(name = "locationId")
    @Id
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Column(name = "linkId")
    @Id
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkBeanPK that = (LinkBeanPK) o;

        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;
        if (linkId != null ? !linkId.equals(that.linkId) : that.linkId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locationId != null ? locationId.hashCode() : 0;
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        return result;
    }
}
