package com.zxd8813.name.dao;


import com.alibaba.fastjson.JSONObject;
import com.zxd8813.name.model.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameDao {
    @Select("SELECT * FROM names")
    List<Name> getNameList();

    @Select("SELECT * FROM names WHERE Room=#{room}")
    List<Name> searchRoom(JSONObject request);

    @Select("SELECT * FROM names WHERE State=#{state}")
    List<Name> searchState(JSONObject request);


}
