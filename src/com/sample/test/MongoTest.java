package com.sample.test;

import java.net.UnknownHostException;
import java.util.Arrays;
/*import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;*/
public class MongoTest {
 public static void main(String[] args) {
  /*try {
   MongoClient mongoClient = new MongoClient(
     new ServerAddress(
       "ec2-54-154-102-238.eu-west-1.compute.amazonaws.com:27017"),
     Arrays.asList(MongoCredential.createMongoCRCredential(
       "admin", "admin", "lO5P3NS5HPY".toCharArray())),
     new MongoClientOptions.Builder().socketKeepAlive(true)
       .socketTimeout(30000).build());
   DB db = mongoClient.getDB("sit2");
   for (String collectionName : db.getCollectionNames())
    System.out.println(collectionName);
  } catch (UnknownHostException e) {
   System.out.println(e.getMessage());
  }*/
 }
}