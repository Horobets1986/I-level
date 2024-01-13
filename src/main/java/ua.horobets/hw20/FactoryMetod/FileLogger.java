package ua.horobets.hw20.FactoryMetod;

import lombok.ToString;

@ToString
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to file");
    }
}