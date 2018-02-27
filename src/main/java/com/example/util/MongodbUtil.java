package com.example.util;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongodbUtil {

	
	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost", 27000);
		client.close();
		// 连接到数据库
		MongoDatabase mongoDatabase = client.getDatabase("newscenter");
		System.out.println("Connect to database successfully");
	}

}
