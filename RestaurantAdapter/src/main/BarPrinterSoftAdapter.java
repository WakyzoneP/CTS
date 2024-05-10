package main;

import main.data.CsvData;
import main.data.XlsData;

public class BarPrinterSoftAdapter implements PrinterSoft {
    private final BarPrinterSoft barSoft;

    public BarPrinterSoftAdapter() {
        this.barSoft = new BarPrinterSoft();
    }

    @Override
    public void printReceipt(CsvData data) {
        XlsData xlsData = convert(data);
        barSoft.printReceipt(xlsData);
    }

    private XlsData convert(CsvData data) {
        return new XlsData();
    }
}
