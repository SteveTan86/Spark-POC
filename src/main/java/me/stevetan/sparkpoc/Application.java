package me.stevetan.sparkpoc;

import static spark.Spark.*;
/**
 * Created by stevetan on 19/8/16.
 */
public class Application {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
