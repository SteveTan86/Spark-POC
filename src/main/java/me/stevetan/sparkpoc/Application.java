package me.stevetan.sparkpoc;

import com.google.gson.Gson;
import me.stevetan.sparkpoc.controllers.Index;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;

/**
 * Created by stevetan on 19/8/16.
 */
public class Application {

//    public final static Logger logger = LoggerFactory.getLogger(Application.class);

//    @Inje

    public static void main(String[] args) {
        bootstrap();

        before((request, response) -> {
            // Setting response type before the handler processes
            // this request will allow handler to override.
            response.type("application/json");
        });

        after((request, response) -> {
            // Compress all the response
            response.header("Content-Encoding", "gzip");
        });

        get("/hello", Index::handleHelloWorld, new Gson()::toJson);

        get("/error", (req, res) -> {
            throw new Exception("What?");
        });
    }

    private static void bootstrap() {
        // TODO
        port(8080);

        // Static Files
        staticFileLocation("/public");

        // Add this line to your project to enable the debug screen
        enableDebugScreen();
    }
}
