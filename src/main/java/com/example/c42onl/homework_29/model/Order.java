package com.example.c42onl.homework_29.model;

public class Order {



    private final String foodName;
    private final double price;


    public Order(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }
    public String getFoodName() {
        return foodName;
    }
    public double getPrice() {
        return price;
    }

}
