package com.publicismedia.dti.cityradarboot.mapper;

import com.publicismedia.dti.cityradarboot.model.UserBus;

public interface UserBusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBus record);

    int insertSelective(UserBus record);

    UserBus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBus record);

    int updateByPrimaryKey(UserBus record);
}