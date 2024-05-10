package main;

import main.data.CsvData;

public class App {
    public static void main(String[] args) throws Exception {
        PrinterSoft printer = new ResPrinterSoft();
        printer.printReceipt(new CsvData());

        BarPrinterSoftAdapter adapter = new BarPrinterSoftAdapter();
        adapter.printReceipt(new CsvData());
    }
}
