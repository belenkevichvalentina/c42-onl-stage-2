package com.example.c42onl.homework_29.service.impl.discount;

import com.example.c42onl.homework_29.service.Discount;

public class BlackFridayDiscount implements Discount {
    @Override
    public double apply(double sum) {
        return sum * 0.95;
    }
}
