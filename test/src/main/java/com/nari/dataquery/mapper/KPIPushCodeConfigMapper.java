package com.nari.dataquery.mapper;

import com.nari.dataquery.entity.KPIPushCodeConfig;

public interface KPIPushCodeConfigMapper {
    int insert(KPIPushCodeConfig record);

    int insertSelective(KPIPushCodeConfig record);
}