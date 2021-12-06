package fr.lernejo.logger;

public class CompositeLogger implements Logger{

    private final Logger log;
    private final Logger logg;

    public CompositeLogger(Logger log, Logger logg) {
        this.log = log;
        this.logg = logg;
    }

    @Override
    public void log(String message) {

        log.log(message);
        logg.log(message);

    }
}
