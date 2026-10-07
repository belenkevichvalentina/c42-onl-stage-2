package com.example.c42onl.homework_31.decorator;

public class SeniorDeveloper extends DeveloperDecorator{
    public SeniorDeveloper(Developer developer){
        super(developer);
    }

    @Override
    public String getDescription() {
        return developer.getDescription() + " + Senior skills";
    }

    @Override
    public double getSalary() {
        return developer.getSalary() +550;
    }
}
