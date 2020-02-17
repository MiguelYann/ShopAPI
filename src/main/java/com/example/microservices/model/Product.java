package com.example.microservices.model;

public class Product {
    private int Id;
    private int price;
    private String name;

    public Product() {

    }

    public Product(int id, int price, String name) {
        Id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
