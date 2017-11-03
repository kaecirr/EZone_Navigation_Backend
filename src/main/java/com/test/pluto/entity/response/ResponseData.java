package com.test.pluto.entity.response;

/**
 * Description: Basic response entity
 *
 * ===========================================================
 * {
    "responseMessage": "SUCCESS",
    "responseCode": "0000"
   }
 * ==================================================================
 *
 *
 * @author Yuntian
 */
public class ResponseData {

    protected String responseMessage;
    protected String responseCode;

    public ResponseData(){};

    public ResponseData(String responseMessage, String responseCode) {
        this.responseMessage = responseMessage;
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

}



