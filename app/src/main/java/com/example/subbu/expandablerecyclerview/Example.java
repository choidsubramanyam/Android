package com.example.subbu.expandablerecyclerview;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by saravanan on 16-Aug-17.
 */

public class Example {
    @SerializedName("isSuccess")
    private Integer isSuccess;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private Integer status;
    @SerializedName("count")
    private Integer count;
    @SerializedName("result")
    private List<Scan> result = null;

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Scan> getResult() {
        return result;
    }

    public void setResult(List<Scan> result) {
        this.result = result;
    }


}
