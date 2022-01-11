package com.signal.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.signal.api.model.UserModel;

@CrossOrigin(origins = { "http://localhost:3000", "https://signal-app-front.herokuapp.com"})
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<UserModel, String> {
	UserModel findByUsername(@Param("username") String username);
	List<UserModel> findByNomRegion(@Param("nomRegion") String nomRegion);
}
