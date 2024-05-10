package main;

import main.data.CsvData;

public class ResPrinterSoft implements PrinterSoft {

    @Override
    public void printReceipt(CsvData data) {
        System.out.println("Printing receipt with a csv data");
    }

}
