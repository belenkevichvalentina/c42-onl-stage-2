package com.dz33.c42onl.homework_29.service.impl.discount;

import com.dz33.c42onl.homework_29.service.Discount;

public class BlackFridayDiscount implements Discount {
    @Override
    public double apply(double sum) {
        return sum * 0.95;
    }
}
