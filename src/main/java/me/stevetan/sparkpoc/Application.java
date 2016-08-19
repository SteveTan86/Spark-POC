package me.stevetan.sparkpoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.*;

/**
 * Created by stevetan on 19/8/16.
 */
public class Application {

    final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        port(8080);

        get("/hello", (req, res) -> "Hello World");
    }
}
