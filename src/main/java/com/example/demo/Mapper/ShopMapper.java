package com.example.demo.Mapper;

import com.example.demo.Entity.PageOptionEntity;
import com.example.demo.Entity.ShopEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface ShopMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property="name",column="name",javaType = String.class)
    })
    @Select("select * from shop limit #{limit}, #{pageSize}")
    public List<ShopEntity> findAll(PageOptionEntity pageOptionEntity);
}
