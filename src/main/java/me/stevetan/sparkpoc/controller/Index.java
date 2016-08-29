package me.stevetan.sparkpoc.controller;

import me.stevetan.sparkpoc.model.User;
import me.stevetan.sparkpoc.util.Database;
import org.hibernate.Session;
import spark.Request;
import spark.Response;

/**
 * Created by stevetan on 19/8/16.
 */
public class Index {
    public static Object handleHelloWorld(Request request, Response response) {

        try {
            Session session = Database.getSessionFactory().openSession();

            session.beginTransaction();

            User user = User
                    .builder()
                    .name("Steve")
                    .build();

            session.save(user);
            session.getTransaction().commit();

            return user;
        } catch (Exception ex) {
            ex.printStackTrace();

            throw ex;
        }
    }
}
