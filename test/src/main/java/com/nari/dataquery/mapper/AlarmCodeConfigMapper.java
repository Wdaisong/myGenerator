package com.nari.dataquery.mapper;

import com.nari.dataquery.entity.AlarmCodeConfig;

public interface AlarmCodeConfigMapper {
    int insert(AlarmCodeConfig record);

    int insertSelective(AlarmCodeConfig record);
}