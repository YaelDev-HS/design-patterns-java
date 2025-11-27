import creacionales.singleton.Logger;




public class App {

    public static void main(String[] args) throws Exception {
        Logger log = Logger.Instance();
        log.WriteMessage("Hello World!");

        Logger log2 = Logger.Instance();
        log2.WriteMessage("New logger?");
    }

}



