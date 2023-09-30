package org.example;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongodbExample {
    public static void main(String[] args) {
        try (MongoClient client = MongoClients.create("mongodb+srv://Accusamus:1234@cluster0.snnw8on.mongodb.net/?retryWrites=true&w=majority")) {
            // Access database
            MongoDatabase db = client.getDatabase("sampleDB");
            // Access collection
            MongoCollection<Document> col = db.getCollection("sampleCollection");
            // Add the doc that you want to pass on
            Document sampleDoc = new Document("id", "1").append("name", "Eric");
            // Add doc to the database
            col.insertOne(sampleDoc);
        } catch (Exception e) {
            throw new RuntimeException("Unable to connect mongoDB", e);
        }
    }
}
