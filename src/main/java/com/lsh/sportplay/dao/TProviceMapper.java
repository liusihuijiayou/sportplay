package com.lsh.sportplay.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.lsh.sportplay.bean.TProvice;

public interface TProviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProvice record);

    int insertSelective(TProvice record);

    TProvice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProvice record);

    int updateByPrimaryKey(TProvice record);


    List<TProvice> findByName(@Param("name")String name);


    int updateNameById(@Param("updatedName")String updatedName,@Param("id")Integer id);


}