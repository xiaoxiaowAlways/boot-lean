package com.publicismedia.dti.cityradarboot.mapper;

import com.publicismedia.dti.cityradarboot.model.UserCustomizedData;

public interface UserCustomizedDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserCustomizedData record);

    int insertSelective(UserCustomizedData record);

    UserCustomizedData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserCustomizedData record);

    int updateByPrimaryKey(UserCustomizedData record);
}