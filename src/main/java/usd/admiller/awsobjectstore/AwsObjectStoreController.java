package usd.admiller.awsobjectstore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import usd.admiller.awsobjectstore.representation.TrackingProfile;

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

    @RequestMapping(method=RequestMethod.POST, path=persistEndpoint)
    public ResponseEntity persistData(
            @RequestParam(value="uuid") String uuid,
            @RequestParam(value="latitude") String xCoordinate,
            @RequestParam(value="longitude") String yCoordinate) {

        logger.debug("Received request to persist data with UUID:" + uuid);

        TrackingProfile profile = new TrackingProfile(uuid, xCoordinate, yCoordinate);

        // do some magic

        return new ResponseEntity(HttpStatus.OK);

    }

}
