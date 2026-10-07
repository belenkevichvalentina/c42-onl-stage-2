package com.example.c42onl.homework_31.decorator;

public abstract class DeveloperDecorator implements Developer {
    public Developer developer;


    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
    @Override
    public String getDescription() {
        return developer.getDescription();
    }

    @Override
    public double getSalary() {
        return developer.getSalary();
    }
}
