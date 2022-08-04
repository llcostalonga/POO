package mongodb_example;

import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class AppMongoDBClient {

	public static void main(String[] args) {
		
		String uri = "mongodb+srv://poo:poo@cluster0.5098y.mongodb.net/?retryWrites=true&w=majority";
		try (MongoClient mongoClient = MongoClients.create(uri)) {
			MongoDatabase database = mongoClient.getDatabase("sample_mflix");
			MongoCollection<Document> collection = database.getCollection("movies");
			Document doc = collection.find(eq("title", "Back to the Future")).first();
			System.out.println(doc.toJson());
		}
	}



}


