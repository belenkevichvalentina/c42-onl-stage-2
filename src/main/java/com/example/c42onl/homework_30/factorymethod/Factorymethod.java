package com.dz33.c42onl.homework_30.factorymethod;

public class Factorymethod {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        Developer javaDev = developerFactory.createDeveloper("java");
        Developer pythonDev = developerFactory.createDeveloper("python");
    }
}
