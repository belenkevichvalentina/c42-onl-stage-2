package com.dz33.c42onl.homework_31.adapter;

public class PrinterAdapter implements Printer{
    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(){
        oldPrinter.printOld();
    }
}
