package com.lsh.sportplay.dao;

import com.lsh.sportplay.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User getUserByMassage(@Param("username") String username,@Param("password") String password);
    public List<User> getAllUser(@Param("username") String username,@Param("pageStart") int PageStart,@Param("pageSize") int pageSize); // username模糊查询
    public int getUserCounts(@Param("username") String username);  //获取用户个数
}
