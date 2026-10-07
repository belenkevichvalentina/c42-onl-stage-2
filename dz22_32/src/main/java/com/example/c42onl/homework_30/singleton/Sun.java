package com.example.c42onl.homework_30.singleton;

public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("Приватный конструктор — нельзя создать извне");
    }

    public static Sun getInstance(){
        if (instance == null) {
            instance = new Sun();
        }

        return instance;
    }
    public void shine(){
        System.out.println(" public void shine");
    }

}
