package ua.horobets.hw18;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonTest {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person person = objectMapper.readValue(new File("src/main/java/ua.horobets/hw18/Input.json"),Person.class);
            System.out.println("Read JSON"+person);

            Person person1 = new Person("Pit", 32, "car");
                    String jsonString = objectMapper.writeValueAsString(person1);
            System.out.println(person1);
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }
    }
}
