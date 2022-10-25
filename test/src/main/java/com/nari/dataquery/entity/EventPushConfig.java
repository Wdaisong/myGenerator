package com.nari.dataquery.entity;

public class EventPushConfig {
    private String eventCode;

    private String cimCode;

    private String eventName;

    private String dataItem;

    private String data1Name;

    private String data2Name;

    private String data3Name;

    private String data4Name;

    private String data5Name;

    private String data6Name;

    private String data7Name;

    private String data8Name;

    private Short whetherPublish;

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode == null ? null : eventCode.trim();
    }

    public String getCimCode() {
        return cimCode;
    }

    public void setCimCode(String cimCode) {
        this.cimCode = cimCode == null ? null : cimCode.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem == null ? null : dataItem.trim();
    }

    public String getData1Name() {
        return data1Name;
    }

    public void setData1Name(String data1Name) {
        this.data1Name = data1Name == null ? null : data1Name.trim();
    }

    public String getData2Name() {
        return data2Name;
    }

    public void setData2Name(String data2Name) {
        this.data2Name = data2Name == null ? null : data2Name.trim();
    }

    public String getData3Name() {
        return data3Name;
    }

    public void setData3Name(String data3Name) {
        this.data3Name = data3Name == null ? null : data3Name.trim();
    }

    public String getData4Name() {
        return data4Name;
    }

    public void setData4Name(String data4Name) {
        this.data4Name = data4Name == null ? null : data4Name.trim();
    }

    public String getData5Name() {
        return data5Name;
    }

    public void setData5Name(String data5Name) {
        this.data5Name = data5Name == null ? null : data5Name.trim();
    }

    public String getData6Name() {
        return data6Name;
    }

    public void setData6Name(String data6Name) {
        this.data6Name = data6Name == null ? null : data6Name.trim();
    }

    public String getData7Name() {
        return data7Name;
    }

    public void setData7Name(String data7Name) {
        this.data7Name = data7Name == null ? null : data7Name.trim();
    }

    public String getData8Name() {
        return data8Name;
    }

    public void setData8Name(String data8Name) {
        this.data8Name = data8Name == null ? null : data8Name.trim();
    }

    public Short getWhetherPublish() {
        return whetherPublish;
    }

    public void setWhetherPublish(Short whetherPublish) {
        this.whetherPublish = whetherPublish;
    }
}