package ua.horobets.hw16;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = ConnectionManager.getConnection()) {
            Statement statement = connection.createStatement();

            String createNewPerson = "insert into public." +
                    "employee(first_name,last_name,contact_id)" +
                    "values ('Lexa', 'Lera',null)";
            statement.executeUpdate(createNewPerson);


            createNewPerson = "insert into public." +
                    "employee(first_name,last_name,contact_id)" +
                    " values ('Saia', 'Goroa',null )";
            statement.executeUpdate(createNewPerson);

            String graduates = "SELECT * from public.employee";
            ResultSet graduatesSet = statement.executeQuery(graduates);
            while (graduatesSet.next()) {
                String lustName = graduatesSet.getString("last_name");
                String firstName = graduatesSet.getString("first_name");
                String contact = graduatesSet.getString("contact_id");
                System.out.println(firstName + " " + lustName + " has contact_id # " + contact);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}