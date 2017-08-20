package com.example.subbu.expandablerecyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by saravanan on 16-Aug-17.
 */

public class Scan {
    @SerializedName("scanId")
    @Expose
    private Integer scanId;
    @SerializedName("scanName")
    @Expose
    private String scanName;
    @SerializedName("patientScanId")
    @Expose
    private Integer patientScanId;
    @SerializedName("isValueSet")
    @Expose
    private Integer isValueSet;
    @SerializedName("scanDate")
    @Expose
    private String scanDate;

    public Integer getScanId() {
        return scanId;
    }

    public void setScanId(Integer scanId) {
        this.scanId = scanId;
    }

    public String getScanName() {
        return scanName;
    }

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    public Integer getPatientScanId() {
        return patientScanId;
    }

    public void setPatientScanId(Integer patientScanId) {
        this.patientScanId = patientScanId;
    }

    public Integer getIsValueSet() {
        return isValueSet;
    }

    public void setIsValueSet(Integer isValueSet) {
        this.isValueSet = isValueSet;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

}
