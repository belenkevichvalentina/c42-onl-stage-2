package com.example.c42onl.homework_31.decorator;

public class Decorator {
    public static void main(String[] args) {
        Developer junior = new JuniorDeveloper();
        System.out.println(junior.getDescription() + "-" + junior.getSalary());

        Developer middle =  new MiddleDeveloper(junior);
        System.out.println(middle.getDescription() + "-" + middle.getSalary());

        Developer senior = new SeniorDeveloper(middle);
        System.out.println(senior.getDescription() + "-" + senior.getSalary());

        Developer teamLead = new TeamLead(senior);
        System.out.println(teamLead.getDescription() + "-" + teamLead.getSalary());
    }
}
