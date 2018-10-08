package usd.admiller.awsobjectstore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import usd.admiller.awsobjectstore.representation.TrackingProfile;

/**
 * The Data Access Class by which we will access AWS
 */
public class AwsObjectStoreDAO {

    /* The constant logger */
    private static final Logger logger = LogManager.getLogger(
            AwsObjectStoreDAO.class);

    public boolean persistDataSet(TrackingProfile profile) {
        //do some magic
        return true;
    }

    /**
     * Class that retrieves and returns the queried dataset
     * @param uuid
     * @return
     */
    public TrackingProfile retrieveDataSet(String uuid) {
        return new TrackingProfile(uuid, "blah", "blah");
    }

}
