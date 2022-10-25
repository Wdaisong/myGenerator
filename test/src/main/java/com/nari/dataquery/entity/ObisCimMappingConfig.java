package com.nari.dataquery.entity;

import java.util.Date;

public class ObisCimMappingConfig {
    private String protItemNo;

    private String protocolNo;

    private String protItemName;

    private String clearProtNo;

    private String obis;

    private String cimCode;

    private String colName;

    private String tableName;

    private String dataProfile;

    private String isValid;

    private Date updateTime;

    private Short multiplier;

    public String getProtItemNo() {
        return protItemNo;
    }

    public void setProtItemNo(String protItemNo) {
        this.protItemNo = protItemNo == null ? null : protItemNo.trim();
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public String getProtItemName() {
        return protItemName;
    }

    public void setProtItemName(String protItemName) {
        this.protItemName = protItemName == null ? null : protItemName.trim();
    }

    public String getClearProtNo() {
        return clearProtNo;
    }

    public void setClearProtNo(String clearProtNo) {
        this.clearProtNo = clearProtNo == null ? null : clearProtNo.trim();
    }

    public String getObis() {
        return obis;
    }

    public void setObis(String obis) {
        this.obis = obis == null ? null : obis.trim();
    }

    public String getCimCode() {
        return cimCode;
    }

    public void setCimCode(String cimCode) {
        this.cimCode = cimCode == null ? null : cimCode.trim();
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getDataProfile() {
        return dataProfile;
    }

    public void setDataProfile(String dataProfile) {
        this.dataProfile = dataProfile == null ? null : dataProfile.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Short multiplier) {
        this.multiplier = multiplier;
    }
}