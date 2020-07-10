package com.lsh.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.lsh.sportplay.bean.QueryInfo;
import com.lsh.sportplay.bean.User;
import com.lsh.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/alluser")
    public String getUserList(QueryInfo queryInfo) {
        // 获取最大列表数和当前编号
        int numbers = userDao.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();

        List<User> users = userDao.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        String res_string = JSON.toJSONString(res);
        return res_string;

    }

    }

