package com.lsh.sportplay.service;

import com.lsh.sportplay.bean.TProvice;
public interface TProviceService{


    int deleteByPrimaryKey(Integer id);

    int insert(TProvice record);

    int insertSelective(TProvice record);

    TProvice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProvice record);

    int updateByPrimaryKey(TProvice record);

}
