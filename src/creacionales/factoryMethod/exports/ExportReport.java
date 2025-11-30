package creacionales.factoryMethod.exports;

import creacionales.factoryMethod.IReport;



public abstract class ExportReport {

    protected abstract IReport createReport();


    public String Export( String content ){
        IReport report = createReport();
        // Lógica común para exportar el reporte
        return report.generate(content);
    }

}
