package com.nari.dataquery.mapper;

import com.nari.dataquery.entity.ObisCimMappingConfig;

public interface ObisCimMappingConfigMapper {
    int insert(ObisCimMappingConfig record);

    int insertSelective(ObisCimMappingConfig record);
}