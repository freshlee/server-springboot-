package com.example.demo;

import com.example.demo.Entity.ShopEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        ShopEntity shopEntity = new ShopEntity();
        shopEntity.setId(111);
        System.out.println(shopEntity.getId());
    }

}
