package ua.horobets.hw18;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.*;
import com.mongodb.client.model.Collation;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

import java.io.IOException;

import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import org.hibernate.mapping.Collection;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoclient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoclient.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("humans");

        Document doc = new Document("Humans", "Name")
                .append("First Name", "Pit")
                .append("Second Name", "Bull");
        collection.insertOne(doc);

        FindIterable<Document> documents = collection.find(Filters.gt("First Name", "Nova"));
        MongoCursor<Document> cursor = documents.cursor();
        while (cursor.hasNext()) {
            Document next = cursor.next();
            System.out.println(next);
        }
        Bson Name = Filters.eq("Humans", "Name");
        System.out.println("Before updating:");
        collection.find(Name).forEach(System.out :: println);
        Bson updates = Updates.combine(Updates.set("Second Name", "Bull"),
                Updates.rename("First Name", "Pit"));
        collection.updateMany(Name, updates);
        System.out.println("After updating:");
        collection.find(Name).forEach(System.out :: println);
        DeleteResult deleteResult = collection.deleteMany
                (Filters.lt("Second Name", "Nova"));
        System.out.println("Documents deleted: " + deleteResult.getDeletedCount());
    }

}
