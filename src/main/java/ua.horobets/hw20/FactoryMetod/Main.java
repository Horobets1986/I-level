package ua.horobets.hw20.FactoryMetod;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerFactory().createLogger(LogType.DATABASELOGGER);

        logger.log("");

    }
}
