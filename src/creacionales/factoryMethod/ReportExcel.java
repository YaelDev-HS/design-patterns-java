package creacionales.factoryMethod;

public class ReportExcel implements IReport {

    public String generate(String message) {
        return "Excel Report: " + message;
    }

}
