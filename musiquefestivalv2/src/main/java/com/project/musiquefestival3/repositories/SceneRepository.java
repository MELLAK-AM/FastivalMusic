package com.project.musiquefestival3.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.musiquefestival3.entities.Scene;

public interface SceneRepository extends MongoRepository<Scene, String> {

	
	
}
