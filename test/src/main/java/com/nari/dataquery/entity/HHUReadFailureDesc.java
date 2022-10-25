package com.nari.dataquery.entity;

public class HHUReadFailureDesc {
    private Short failCode;

    private String failDescEn;

    private String failDescAr;

    private Short numOfPhotos;

    private String requiredEn;

    private String requiredAr;

    private Short reqAppLoaded;

    private String remarkCode;

    public Short getFailCode() {
        return failCode;
    }

    public void setFailCode(Short failCode) {
        this.failCode = failCode;
    }

    public String getFailDescEn() {
        return failDescEn;
    }

    public void setFailDescEn(String failDescEn) {
        this.failDescEn = failDescEn == null ? null : failDescEn.trim();
    }

    public String getFailDescAr() {
        return failDescAr;
    }

    public void setFailDescAr(String failDescAr) {
        this.failDescAr = failDescAr == null ? null : failDescAr.trim();
    }

    public Short getNumOfPhotos() {
        return numOfPhotos;
    }

    public void setNumOfPhotos(Short numOfPhotos) {
        this.numOfPhotos = numOfPhotos;
    }

    public String getRequiredEn() {
        return requiredEn;
    }

    public void setRequiredEn(String requiredEn) {
        this.requiredEn = requiredEn == null ? null : requiredEn.trim();
    }

    public String getRequiredAr() {
        return requiredAr;
    }

    public void setRequiredAr(String requiredAr) {
        this.requiredAr = requiredAr == null ? null : requiredAr.trim();
    }

    public Short getReqAppLoaded() {
        return reqAppLoaded;
    }

    public void setReqAppLoaded(Short reqAppLoaded) {
        this.reqAppLoaded = reqAppLoaded;
    }

    public String getRemarkCode() {
        return remarkCode;
    }

    public void setRemarkCode(String remarkCode) {
        this.remarkCode = remarkCode == null ? null : remarkCode.trim();
    }
}