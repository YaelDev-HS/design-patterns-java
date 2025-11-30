import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import creacionales.factoryMethod.exports.ExportReport;
import creacionales.factoryMethod.exports.ExportReportFactory;
import creacionales.singleton.Logger;



public class App {

    public static void main(String[] args) throws Exception {
        // App.singleton();
        // App.factoryMethod();
        App.abstractFactory();
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

        ExportReport report = ExportReportFactory.getExporter(reportType);
        String content = report.Export(message);

        System.out.println(content);
    }

    private static void abstractFactory(){
    }
}



