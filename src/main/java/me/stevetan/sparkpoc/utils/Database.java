package me.stevetan.sparkpoc.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by stevetan on 23/8/16.
 */
public class Database {
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        // TODO Perhaps we should change PU name to follow app namespace?
        return Persistence.createEntityManagerFactory("SparkPU");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getEntityManagerFactory().close();
    }
}
