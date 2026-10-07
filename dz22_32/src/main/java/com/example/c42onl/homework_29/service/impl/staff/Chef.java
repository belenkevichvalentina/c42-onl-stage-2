package com.example.c42onl.homework_29.service.impl.staff;

import com.example.c42onl.homework_29.service.Cookable;

public class Chef implements Cookable {
    @Override
    public void cookFood() {
        System.out.println("Готовка еды-заказа.");
    }
}
