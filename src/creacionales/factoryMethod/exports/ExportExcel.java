package creacionales.factoryMethod.exports;

import creacionales.factoryMethod.IReport;
import creacionales.factoryMethod.ReportExcel;



public class ExportExcel extends ExportReport {

    @Override
    protected IReport createReport() {
        return new ReportExcel();
    }

}
