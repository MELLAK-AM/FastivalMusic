package com.project.musiquefestival3.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.musiquefestival3.entities.Festival;

public interface FestivalRepository extends MongoRepository<Festival, String>{
	Festival findByNom(String nom);
}
