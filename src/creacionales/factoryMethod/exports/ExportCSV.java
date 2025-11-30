package creacionales.factoryMethod.exports;

import creacionales.factoryMethod.IReport;
import creacionales.factoryMethod.ReportCsv;

public class ExportCSV extends ExportReport {

    @Override
    protected IReport createReport() {
        return new ReportCsv();
    }

}
