package fr.lernejo.logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class ContextualLogger implements Logger{
    public Logger delegateLogger;
    public String callerClass;
    public ContextualLogger(String nomClass, Logger logger){
        this.callerClass = nomClass;
        this.delegateLogger = logger;
    }
    public void log(String message) {
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }
}
