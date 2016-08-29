package me.stevetan.sparkpoc.controller;

import me.stevetan.sparkpoc.model.User;
import me.stevetan.sparkpoc.util.Database;
import spark.Request;
import spark.Response;

import javax.persistence.EntityManager;

/**
 * Created by stevetan on 19/8/16.
 */
public class Index {
    public static Object handleHelloWorld(Request request, Response response) {
        EntityManager entityManager = Database.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        User user = User
                .builder()
                .name("Steve")
                .build();

        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();

        return user;
    }
}
