package com.deisgnpatterns.D1SOLIDPrinciples.SOLID.D.di1WithoutDependencyInversion;

/*interface ILogger{
    public void logInformation(String logInfo);
}*/
class Logger{
    public void logInformation(String logInfo) {
        System.out.println(logInfo);
    }
}

class LoggingToFile{
    private Logger logger;
    public LoggingToFile(Logger l) {
        this.logger = l;
    }
    public void logging() {
        logger.logInformation("Printing Logs to the file...");
    }

}

class LoggingToDb{
    private Logger logger;
    public LoggingToDb(Logger l) {
        this.logger = l;
    }
    public void logging() {
        logger.logInformation("saving Logs to the database...");
    }

}
public class DI {
    public static void main(String[] args) {
        LoggingToFile fileLogger = new LoggingToFile(new Logger());
        fileLogger.logging();

        LoggingToDb dbLogger = new LoggingToDb(new Logger());
        dbLogger.logging();

    }
}