package creacionales.singleton;


public class Logger {

    // Carga temprana
    // private static Logger logger = new Logger();

    private Logger(){
    }

    // en java las clases internas estaticas no se cargan hasta que son referenciadas
    private static class Holder { // LAZY LOADING
        private static final Logger INSTANCE = new Logger();
    }

    //! NO FUNCIONA CUANDO HAY PARALELISMO
    // public static Logger Instance(){
    //     if(logger == null){
    //         System.out.println("Creando instancia del logger");
    //         logger = new Logger();
    //         return logger;
    //     }

    //     System.out.println("Retornando logger instanciado");
    //     return logger;
    // }

    public static Logger Instance(){
        return Holder.INSTANCE;
    }

    public Boolean WriteMessage(String message){
        System.out.println(message);
        return true;
    }

}

