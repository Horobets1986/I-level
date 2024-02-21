package ua.horobets.hw22;


import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (BufferedReader reader = openConsoleReader()) {
            String message = readMessage(reader);

            while (!message.equals("q")) {
                try (Socket socket = new Socket("localhost", 1234);
                     Writer writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
                    writer.write(message);
                    writer.flush();
                }
                message = readMessage(reader);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static BufferedReader openConsoleReader() {
        InputStreamReader consoleInputStream = new InputStreamReader(System.in);
        return new BufferedReader(consoleInputStream);
    }

    private static String readMessage(BufferedReader reader) throws IOException {
        System.out.print("Enter a message for the server(q for quit): ");
        return reader.readLine();
    }
}