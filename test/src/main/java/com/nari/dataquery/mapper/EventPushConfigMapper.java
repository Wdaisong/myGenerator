package com.nari.dataquery.mapper;

import com.nari.dataquery.entity.EventPushConfig;

public interface EventPushConfigMapper {
    int deleteByPrimaryKey(String eventCode);

    int insert(EventPushConfig record);

    int insertSelective(EventPushConfig record);

    EventPushConfig selectByPrimaryKey(String eventCode);

    int updateByPrimaryKeySelective(EventPushConfig record);

    int updateByPrimaryKey(EventPushConfig record);
}