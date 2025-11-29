import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import creacionales.factoryMethod.ReportCsv;
import creacionales.factoryMethod.ReportExcel;
import creacionales.factoryMethod.ReportPdf;
import creacionales.singleton.Logger;



public class App {

    public static void main(String[] args) throws Exception {
        // App.singleton();
        App.factoryMethod();
    }


    private static void singleton(){
        // Probando si funciona en paralelismo
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                Logger logger = Logger.Instance();
                System.out.println(logger);
            });
        }

        executor.shutdown();
    }

    private static void factoryMethod(){
        String reportType = "PDF";
        final String message = "This is the report content.";

        String report;

        if(reportType == "PDF"){
            ReportPdf pdf = new ReportPdf();
            report = pdf.generate(message);
        }else if(reportType == "Excel"){
            ReportExcel excel = new ReportExcel();
            report = excel.generate(message);
        }else if(reportType == "CSV"){
            ReportCsv csv = new ReportCsv();
            report = csv.generate(message);
        }else {
            throw new RuntimeException("Report type not supported");
        }

        System.out.println(report);
    }

}



