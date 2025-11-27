package creacionales.singleton;


public class Logger {

    private static Logger logger = null;


    private Logger(){
    }


    public static Logger Instance(){
        if(logger == null){
            System.out.println("Creando instancia del logger");
            logger = new Logger();
            return logger;
        }

        System.out.println("Retornando logger instanciado");
        return logger;
    }

    public Boolean WriteMessage(String message){
        System.out.println(message);
        return true;
    }

}

