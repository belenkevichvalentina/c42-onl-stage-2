package com.example.c42onl.homework_31.decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + TeamLead skills";
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 1000;
    }
}
