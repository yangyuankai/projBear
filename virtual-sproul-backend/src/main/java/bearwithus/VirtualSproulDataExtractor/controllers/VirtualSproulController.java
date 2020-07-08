package bearwithus.VirtualSproulDataExtractor.controllers;

import bearwithus.VirtualSproulDataExtractor.CRUDrepo.orgRepository;
import bearwithus.VirtualSproulDataExtractor.entities.OrganizationEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VirtualSproulController {

    @Autowired
    orgRepository repo;

    @CrossOrigin
    @GetMapping("/getClubData")
    public List<OrganizationEntry> getOrganizationEntries() {
        return repo.findAll();
    }

    @CrossOrigin
    @GetMapping("/searchByName")
    public List<OrganizationEntry> searchByName(String search) {
        List<OrganizationEntry> results = getOrganizationEntries();
        for (OrganizationEntry org: results) {
            if (org.getName().toLowerCase().contains(search.toLowerCase()) || org.getAbbrevName().toUpperCase().contains(search.toUpperCase())) {
                results.add(org);
            }
        }
        return results;
    }


}
