package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger {

    public FilteredLogger(Logger delegate, Predicate<String> condition){


    }


    @Override
    public void log(String message) {

    }
}
