package creacionales.factoryMethod;

public class ReportPdf implements IReport {

    public String generate(String message) {
        return "PDF Report: " + message;
    }

}
