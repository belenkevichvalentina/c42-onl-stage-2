package com.example.c42onl.homework_31.adapter;

public class Adapter {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);
        printer.print();

    }


}
