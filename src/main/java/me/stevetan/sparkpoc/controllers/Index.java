package me.stevetan.sparkpoc.controllers;

import me.stevetan.sparkpoc.models.User;
import me.stevetan.sparkpoc.utils.Database;
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

        User user = User
                .builder()
                .name("Steve")
                .build();

        session.save(user);
        session.getTransaction().commit();

        return user;
    }
}
