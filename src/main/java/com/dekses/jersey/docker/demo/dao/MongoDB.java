/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo.dao;

import com.dekses.jersey.docker.demo.model.Patient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.DB;
import com.mongodb.client.MongoCollection;


public class MongoDB {

    MongoClientURI uri;

MongoClient mongoClient;
DB database;

    public MongoDB()
    {
    this.uri = new MongoClientURI(
    "mongodb+srv://mauricionietom:Mauricio2013.@cluster0-s0yrw.mongodb.net/test?retryWrites=true");
    this.mongoClient = new MongoClient(uri);
    this.database = mongoClient.getDB("HOSPITAL");
       }
    
    public void AddPatient(String Nombre, String Direccion,int telefono, String  publico ){
        
        try{
           
            DBCollection coll = this.database.getCollection("PACIENTE");
            DBObject doc = new BasicDBObject().append("Nombre", Nombre).append("Direccion", Direccion).append("Telefono", telefono).append("Publico", publico);
                    
                    coll.insert(doc);
            
   
    }
        catch(Exception e){
 System.err.println( e.getClass().getName() + ": " +
 e.getMessage() );
        }
        
    }
}
    


