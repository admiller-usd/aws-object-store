package usd.admiller.awsobjectstore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

/**
 * The REST Controller Class that handles web requests
 */
@RestController
public class AwsObjectStoreController {

    /* The constant logger */
    private static final Logger logger = LogManager.getLogger(
            AwsObjectStoreController.class);

    /* REST Endpoint for persisting data */
    private static final String persistEndpoint = "/persist";

    /* REST Endpoint for retrieving data */
    private static final String retrieveEndpoint = "/retrieve";



}
