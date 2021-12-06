package fr.lernejo.logger;

public class LoggerFactory {

    private static String pathAsString;

    public static Logger getLogger(String name){

        Logger consoleLogger = new FileLogger();//objet de type logger, type abstrait

        return new ContextualLogger(name, consoleLogger);


    }
}
