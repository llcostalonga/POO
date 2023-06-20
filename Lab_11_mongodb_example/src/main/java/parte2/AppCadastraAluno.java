package parte2;

import java.util.Arrays;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

public class AppCadastraAluno {
	 public static void main(String[] args) {
	        // Replace the uri string with your MongoDB deployment's connection string
	    	  //String uri = "mongodb+srv://poo:poo@cluster0.5098y.mongodb.net/?retryWrites=true&w=majority";

	    	  String uri = "mongodb+srv://poo:poo@cluster0.bdnfi4u.mongodb.net/?retryWrites=true&w=majority";
	    	  
	        try (MongoClient mongoClient = MongoClients.create(uri)) {

	            MongoDatabase database = mongoClient.getDatabase("ceunes_personal");
	            MongoCollection<Document> collection = database.getCollection("alunos");

	            try {
	                InsertOneResult result = collection.insertOne(new Document()
	                        .append("_id", new ObjectId())
	                        .append("nome", "Zé Mané")
	                        .append("matricula", 654321));

	                System.out.println("Success! Inserted document id: " + result.getInsertedId());
	            } catch (MongoException me) {
	                System.err.println("Unable to insert due to an error: " + me);
	            }
	        }
	    }
}
