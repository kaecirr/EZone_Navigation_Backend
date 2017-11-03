package com.test.pluto.entity.request;

import javax.persistence.Entity;

/**
 * Description: Basic request entity
 *
 * ==============================================================
 * {
        "requestMessage": ""
    }
 * ==================================================================
 *
 * @author captain
 */
@Entity
public class RequestData {
    private String requestMessage;

    public RequestData(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public RequestData() {
    }

    public String getRequestMessage() {
        return this.requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

}