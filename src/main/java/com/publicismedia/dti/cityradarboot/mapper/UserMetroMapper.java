package com.publicismedia.dti.cityradarboot.mapper;

import com.publicismedia.dti.cityradarboot.model.UserMetro;

public interface UserMetroMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserMetro record);

    int insertSelective(UserMetro record);

    UserMetro selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMetro record);

    int updateByPrimaryKey(UserMetro record);
}