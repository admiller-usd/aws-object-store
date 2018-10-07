package usd.admiller.awsobjectstore.representation;

/**
 * The Representation Class by which json will be serialized/de-serialized
 */
public class TrackingProfile {

    private final String uuid;
    private final String xCoordinate;
    private final String yCoordinate;

    public TrackingProfile(String uuid, String xCoordinate, String yCoordinate) {
        this.uuid = uuid;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getUuid() {
        return uuid;
    }

    public String getxCoordinate() {
        return xCoordinate;
    }

    public String getyCoordinate() {
        return yCoordinate;
    }
}
