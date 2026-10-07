package com.dz33.c42onl.homework_31.facade;

public class Computer {
    private PowerSupply powerSupply;
    private HDD hdd;
    private DVDDrive dvdDrive;
    private Monitor monitor;

    public Computer(PowerSupply powerSupply, Monitor monitor, DVDDrive dvdDrive, HDD hdd) {
        this.powerSupply = powerSupply;
        this.monitor = monitor;
        this.dvdDrive = dvdDrive;
        this.hdd = hdd;
    }
    public void start() {
        System.out.println("=== Computer start ===");
        powerSupply.on();
        hdd.spinUp();
        monitor.on();
    }
    public void shutdown() {
        System.out.println("=== Computer off ===");
        monitor.off();
        hdd.spinDown();
        powerSupply.off();
    }

    public void openDVD() {
        dvdDrive.open();
    }


}
