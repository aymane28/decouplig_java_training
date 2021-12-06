package fr.lernejo.logger;

public class LoggerFactory {

    private static String pathAsString;

    public static Logger getLogger(String name){

        Logger consoleLogger=new FileLogger();

        Logger contextualLogger=new ContextualLogger(name, consoleLogger);
        Logger cons = new ConsoleLogger();

        return new CompositeLogger(contextualLogger, cons);

/*
        Logger consoleLogger = new FileLogger();//objet de type logger, type abstrait

        return new ContextualLogger(name, consoleLogger);*/
        
        /*
        Logger log = new FileLogger();//objet de type logger, type abstrait
        Logger logg = new ConsoleLogger();
        return new CompositeLogger(log, logg);*/


    }
}
