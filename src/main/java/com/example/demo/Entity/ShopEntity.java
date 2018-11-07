package com.example.demo.Entity;

public class ShopEntity {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                '}';
    }
}
