package me.stevetan.sparkpoc;

import com.google.gson.Gson;
import me.stevetan.sparkpoc.configs.AppConfig;
import me.stevetan.sparkpoc.controllers.Index;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;

/**
 * Created by stevetan on 19/8/16.
 */
public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        bootstrap();

        before((request, response) -> {
            // Setting response type before the handler processes
            // this request will allow handler to override.
            response.type("application/json");
        });

        after((request, response) -> {
            // Compress all the responses
            response.header("Content-Encoding", "gzip");
        });

        get("/hello", Index::handleHelloWorld, new Gson()::toJson);

        get("/error", (req, res) -> {
            throw new Exception("What?");
        });
    }

    private static void bootstrap() {
        logger.info("System Env Variables: {}", System.getenv());

        port(Integer.parseInt(AppConfig.PORT.getValue()));

        // Static Files
        staticFiles.location("/public");
        staticFiles.expireTime(24 * 60 * 60);
    }
}
