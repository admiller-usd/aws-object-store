package usd.admiller.awsobjectstore.representation;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * The Data Model class used to represent objects going to/from AWS
 */
@DynamoDBTable(tableName = "TrackingInfo")
public class TrackingDataModel {

    private final String uuid;
    private final String xCoordinate;
    private final String yCoordinate;

    public TrackingDataModel(String uuid, String xCoordinate, String yCoordinate) {
        this.uuid = uuid;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // The primary key or "hash" key
    @DynamoDBHashKey
    public String getUuid() {
        return uuid;
    }

    @DynamoDBAttribute
    public String getxCoordinate() {
        return xCoordinate;
    }

    @DynamoDBAttribute
    public String getyCoordinate() {
        return yCoordinate;
    }
}
