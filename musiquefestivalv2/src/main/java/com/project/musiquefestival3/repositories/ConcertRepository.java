package com.project.musiquefestival3.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.musiquefestival3.entities.Concert;



public interface ConcertRepository extends MongoRepository<Concert, String>{

	Concert findByTitre(String titre);

}
