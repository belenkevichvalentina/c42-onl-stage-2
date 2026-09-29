package com.example.c42onl.homework_30.singleton;

public class Singleton {
    public static void main(String[] args) {
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();

        System.out.println(sun1 == sun2);
        sun1.shine();
        System.out.println("sun1 == sun2 true — один и тот же объект private Sun() — нельзя создать new Sun() " +
                "getInstance() — создаёт объект при первом вызове.");
    }
}
