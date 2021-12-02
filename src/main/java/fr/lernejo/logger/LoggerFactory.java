package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){

        Logger logger = new ConsoleLogger();//objet de type logger, type abstrait
        return logger;
    }

    //return new ConsoleLogger();
}
