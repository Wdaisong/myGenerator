package com.nari.dataquery.entity;

public class AlarmCodeConfig {
    private String eventNo;

    private String cimNo;

    private String eventName;

    private Short eventType;

    private Short isPush;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    public String getCimNo() {
        return cimNo;
    }

    public void setCimNo(String cimNo) {
        this.cimNo = cimNo == null ? null : cimNo.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Short getEventType() {
        return eventType;
    }

    public void setEventType(Short eventType) {
        this.eventType = eventType;
    }

    public Short getIsPush() {
        return isPush;
    }

    public void setIsPush(Short isPush) {
        this.isPush = isPush;
    }
}