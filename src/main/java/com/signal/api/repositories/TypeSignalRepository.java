package com.signal.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.signal.api.model.TypeSignalModel;

@CrossOrigin(origins = { "http://localhost:3000", "https://signal-app-front.herokuapp.com"})
@RepositoryRestResource(collectionResourceRel = "typesignals", path = "typesignals")
public interface TypeSignalRepository extends MongoRepository<TypeSignalModel, String>{
	List<TypeSignalModel> findByNomType(@Param("nomType") String nomType);
}
