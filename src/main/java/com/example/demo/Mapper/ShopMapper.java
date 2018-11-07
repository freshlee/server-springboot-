package com.example.demo.Mapper;

import com.example.demo.Entity.ShopEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShopMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property="name",column="name",javaType = String.class)
    })
    @Select("select * from shop")
    public List<ShopEntity> findAll();
}
