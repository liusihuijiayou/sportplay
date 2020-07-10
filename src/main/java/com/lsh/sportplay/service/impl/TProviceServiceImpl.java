package com.lsh.sportplay.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lsh.sportplay.dao.TProviceMapper;
import com.lsh.sportplay.bean.TProvice;
import com.lsh.sportplay.service.TProviceService;
@Service
public class TProviceServiceImpl implements TProviceService{

    @Resource
    private TProviceMapper tProviceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tProviceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TProvice record) {
        return tProviceMapper.insert(record);
    }

    @Override
    public int insertSelective(TProvice record) {
        return tProviceMapper.insertSelective(record);
    }

    @Override
    public TProvice selectByPrimaryKey(Integer id) {
        return tProviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TProvice record) {
        return tProviceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TProvice record) {
        return tProviceMapper.updateByPrimaryKey(record);
    }

}
