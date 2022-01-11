package com.signal.api.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.signal.api.model.SignalModel;

@CrossOrigin(origins = { "http://localhost:3000", "https://signal-app-front.herokuapp.com"})
@RepositoryRestResource(collectionResourceRel = "signals", path = "signals")
public interface SignalRepository extends MongoRepository<SignalModel, String>  {
	List<SignalModel> findByNomType(@Param("nomType") String nomType);
	List<SignalModel> findByDateSignal(@Param("dateSignal") Date dateSignal);
	List<SignalModel> findByStatus(@Param("status") String status);
}
