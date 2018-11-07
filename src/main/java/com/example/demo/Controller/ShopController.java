package com.example.demo.Controller;

import com.example.demo.Entity.ShopEntity;
import com.example.demo.Mapper.ShopMapper;
import com.example.demo.Service.ShopService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;
    @GetMapping("/getShops")
    public String getShop () throws JsonProcessingException {
        List<ShopEntity> res = shopService.find();
        System.out.println(res);
        JSONArray jsonObject = JSONArray.fromObject(res);

        return res.toString();
    }
}
