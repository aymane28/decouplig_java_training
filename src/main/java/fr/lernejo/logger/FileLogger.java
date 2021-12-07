package fr.lernejo.logger;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogger implements Logger {
    private final Path path;

    public FileLogger() {
        path = Paths.get("filelogger.txt").toAbsolutePath();
    }

    public void log(String message) {
        try {
            Files.write(path, (message + "\n").getBytes(), APPEND, CREATE);
        } catch (IOException e) {
            throw new RuntimeException("Cannot write log message to file [" + path + "]", e);
        }
    }
}
