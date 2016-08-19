package me.stevetan.sparkpoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;

/**
 * Created by stevetan on 19/8/16.
 */
public class Application {

    final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        bootstrap();

        get("/hello", (req, res) -> "Hello World");

        get("/error", (req, res) -> {
            throw new Exception("What?");
        });
    }

    private static void bootstrap() {
        // TODO
        port(8080);

        // Add this line to your project to enable the debug screen
        enableDebugScreen();
    }
}
