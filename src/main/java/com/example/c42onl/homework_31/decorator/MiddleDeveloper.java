package com.dz33.c42onl.homework_31.decorator;

public class MiddleDeveloper extends DeveloperDecorator{
    public MiddleDeveloper(Developer developer){
        super(developer);
    }
    @Override
    public String getDescription() {
        return developer.getDescription() + " + Middle skills";
    }

    @Override
    public double getSalary() {
        return developer.getSalary() +350;
    }
}
