package com.example.c42onl.homework_30.builder;

public class Builder {
    public static void main(String[] args) {
        Developer developer = new Developer.Builder()
                .setName("Иван")
                .setLanguage("Java")
                .setExperienceYears(9)
                .setSenior(true)
                .build();
        System.out.println(developer);
    }
}
