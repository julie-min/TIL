package com.multi.mvc007;

import java.util.Scanner;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MongoTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Requires the MongoDB Java Driver.
		 * https://mongodb.github.io/mongo-java-driver
		 */

		MongoClient mongoClient = new MongoClient(
		    new MongoClientURI(
		        "mongodb://localhost:27017/"
		    )
		);
		MongoDatabase database = mongoClient.getDatabase("shop");
		MongoCollection<Document> collection = database.getCollection("member");

		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		String nickname = sc.next();
		String phone = sc.next();
		sc.close();
		
		
		Document doc = new Document();
		doc.append("id", id);
		doc.append("pw", pw);
		doc.append("name", name);
		doc.append("tel", tel);
		doc.append("nickname", nickname);
		doc.append("phone", phone);
		collection.insertOne(doc);
		System.out.println("insertone 성공");
	}
	

}
