package creacionales.factoryMethod.exports;

import creacionales.factoryMethod.IReport;
import creacionales.factoryMethod.ReportPdf;



public class ExportPDF extends ExportReport {

    @Override
    protected IReport createReport() {
        return new ReportPdf();
    }

}
