package com.signal.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.signal.api.model.RegionModel;

@CrossOrigin(origins = { "http://localhost:3000", "https://signal-app-front.herokuapp.com/"})
@RepositoryRestResource(collectionResourceRel = "regions", path = "regions")
public interface RegionRepository extends MongoRepository<RegionModel, String> {
	RegionModel findByNomRegion(@Param("nomRegion") String nomRegion);
}
