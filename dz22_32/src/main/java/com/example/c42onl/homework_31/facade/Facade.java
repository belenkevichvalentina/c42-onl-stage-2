package com.example.c42onl.homework_31.facade;

public class Facade {
    public static void main(String[] args) {
        PowerSupply ps = new PowerSupply();
        Monitor monitor =  new Monitor();
        DVDDrive dvdDrive = new DVDDrive();
        HDD hdd = new HDD();

        Computer computer = new Computer(ps, monitor, dvdDrive, hdd);
        computer.start();
        computer.shutdown();
        computer.openDVD();
    }
}
