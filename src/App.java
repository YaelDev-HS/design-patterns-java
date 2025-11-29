import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import creacionales.singleton.Logger;



public class App {

    public static void main(String[] args) throws Exception {
        App.singleton();
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

}



