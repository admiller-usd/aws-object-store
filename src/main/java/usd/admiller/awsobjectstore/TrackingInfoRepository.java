package usd.admiller.awsobjectstore;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import usd.admiller.awsobjectstore.representation.TrackingDataModel;

import java.util.List;

@EnableScan
public interface TrackingInfoRepository extends
        CrudRepository<TrackingDataModel, String> {

    List<TrackingDataModel> findById(String id);

}
