package com.dz33.c42onl.homework_31.decorator;

public class JuniorDeveloper implements Developer{
    @Override
    public String getDescription() {
        return "junior Developer";
    }

    @Override
    public double getSalary() {
        return 300;
    }
}
