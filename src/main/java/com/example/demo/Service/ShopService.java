package com.example.demo.Service;

import com.example.demo.Entity.ShopEntity;
import com.example.demo.Mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ShopService implements Serializable {
    @Autowired
    private ShopMapper shopMapper;
    public List<ShopEntity> find(){
        //分页插件: 查询第1页，每页10行
        List<ShopEntity> ShopList = shopMapper.findAll();
        return ShopList;
    }
}
