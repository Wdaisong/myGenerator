package com.nari.dataquery.entity;

public class KPIPushCodeConfig {
    private String cimCode;

    private String kpiName;

    private Short kpiType;

    private String kpiTable;

    private String kpiFilter;

    private String dcuCellFilter;

    private Short isPush;

    private Short pushPeriod;

    public String getCimCode() {
        return cimCode;
    }

    public void setCimCode(String cimCode) {
        this.cimCode = cimCode == null ? null : cimCode.trim();
    }

    public String getKpiName() {
        return kpiName;
    }

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName == null ? null : kpiName.trim();
    }

    public Short getKpiType() {
        return kpiType;
    }

    public void setKpiType(Short kpiType) {
        this.kpiType = kpiType;
    }

    public String getKpiTable() {
        return kpiTable;
    }

    public void setKpiTable(String kpiTable) {
        this.kpiTable = kpiTable == null ? null : kpiTable.trim();
    }

    public String getKpiFilter() {
        return kpiFilter;
    }

    public void setKpiFilter(String kpiFilter) {
        this.kpiFilter = kpiFilter == null ? null : kpiFilter.trim();
    }

    public String getDcuCellFilter() {
        return dcuCellFilter;
    }

    public void setDcuCellFilter(String dcuCellFilter) {
        this.dcuCellFilter = dcuCellFilter == null ? null : dcuCellFilter.trim();
    }

    public Short getIsPush() {
        return isPush;
    }

    public void setIsPush(Short isPush) {
        this.isPush = isPush;
    }

    public Short getPushPeriod() {
        return pushPeriod;
    }

    public void setPushPeriod(Short pushPeriod) {
        this.pushPeriod = pushPeriod;
    }
}