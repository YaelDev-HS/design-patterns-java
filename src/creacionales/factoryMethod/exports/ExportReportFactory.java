package creacionales.factoryMethod.exports;


public class ExportReportFactory {

    public static ExportReport getExporter(String type) {
        switch (type.toLowerCase().trim()) {
            case "pdf":
                return new ExportPDF();
            case "csv":
                return new ExportCSV();
            case "excel":
                return new ExportExcel();
            default:
                throw new IllegalArgumentException("Unknown export type: " + type);
        }
    }

}
