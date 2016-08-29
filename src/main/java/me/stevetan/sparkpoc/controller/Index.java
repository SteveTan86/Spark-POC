package me.stevetan.sparkpoc.controller;

import me.stevetan.sparkpoc.model.People;
import me.stevetan.sparkpoc.util.Database;
import org.hibernate.Session;
import spark.Request;
import spark.Response;

/**
 * Created by stevetan on 19/8/16.
 */
public class Index {
    public static Object handleHelloWorld(Request request, Response response) {

        Session session = Database.getSessionFactory().openSession();

        session.beginTransaction();

        People people = People
                .builder()
                .name("Steve")
                .build();

        session.save(people);
        session.getTransaction().commit();

        return people;
    }
}
