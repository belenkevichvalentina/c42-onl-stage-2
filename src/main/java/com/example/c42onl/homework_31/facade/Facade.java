package com.example.c42onl.homework_31.facade;

public class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
        computer.openDVD();
    }
}
