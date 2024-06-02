package com.multi.mvc007;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import com.mongodb.client.FindIterable;


public class MongoTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Requires the MongoDB Java Driver.
		 * https://mongodb.github.io/mongo-java-driver
		 */

		Bson filter = new Document("writer", "apple");

		MongoClient mongoClient = new MongoClient(
		    new MongoClientURI(
		        "mongodb://localhost:27017/"
		    )
		);
		MongoDatabase database = mongoClient.getDatabase("shop");
		MongoCollection<Document> collection = database.getCollection("bbs9");
		FindIterable<Document> result = collection.find(filter);
		System.out.println(result.first());
		System.out.println(result.first().getString("title"));
		System.out.println(result.first().getString("content"));
		System.out.println(result.first().getString("writer"));
	}

}
