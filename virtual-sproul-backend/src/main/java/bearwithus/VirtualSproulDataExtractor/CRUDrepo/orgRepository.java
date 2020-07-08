package bearwithus.VirtualSproulDataExtractor.CRUDrepo;

import bearwithus.VirtualSproulDataExtractor.entities.OrganizationEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface orgRepository extends MongoRepository<OrganizationEntry, String> {

}
