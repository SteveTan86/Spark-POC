package me.stevetan.sparkpoc.controllers;

import me.stevetan.sparkpoc.models.People;
import me.stevetan.sparkpoc.utils.Database;
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

        People people = People
                .builder()
                .name("Hello Adele")
                .build();

        entityManager.persist(people);
        entityManager.getTransaction().commit();
        entityManager.close();

        return people;
    }
}
