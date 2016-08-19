package me.stevetan.sparkpoc.controllers;

import me.stevetan.sparkpoc.beans.User;
import spark.Request;
import spark.Response;

/**
 * Created by stevetan on 19/8/16.
 */
public class Index {
    public static Object handleHelloWorld(Request request, Response response) {
        User user = User
                .builder()
                .name("Steve")
                .email("i@stevetan.me")
                .mobilePhoneNumber("+65 96565683")
                .build();

        return user;
    }
}
