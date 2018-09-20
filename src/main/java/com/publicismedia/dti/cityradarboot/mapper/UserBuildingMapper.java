package com.publicismedia.dti.cityradarboot.mapper;

import com.publicismedia.dti.cityradarboot.model.UserBuilding;

public interface UserBuildingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBuilding record);

    int insertSelective(UserBuilding record);

    UserBuilding selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBuilding record);

    int updateByPrimaryKey(UserBuilding record);
}