package com.lsh.sportplay.dao;

import com.lsh.sportplay.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();  //然后编写对应的映射文件MeauMapping

}
