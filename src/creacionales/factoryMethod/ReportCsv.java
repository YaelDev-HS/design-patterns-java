package creacionales.factoryMethod;

public class ReportCsv implements IReport {

    public String generate(String message) {
        return "CSV Report: " + message;
    }

}
