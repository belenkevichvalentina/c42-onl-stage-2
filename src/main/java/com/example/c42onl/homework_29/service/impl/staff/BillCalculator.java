package com.dz33.c42onl.homework_29.service.impl.staff;

import com.dz33.c42onl.homework_29.model.Order;

public class BillCalculator {
    public double calculateTotal(Order order){
        return order.getPrice();
    }
}
