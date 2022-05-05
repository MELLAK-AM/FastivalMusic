package com.project.musiquefestival3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.musiquefestival3.entities.Scene;
import com.project.musiquefestival3.repositories.SceneRepository;

@Service
public class SceneService {
	
	private SceneRepository sceneRepository;
	
	public SceneService (
			SceneRepository salleRepository) {
		this.sceneRepository = salleRepository;
	}

	public List<Scene> findAll(){
		return this.sceneRepository.findAll();
	}

	public Optional<Scene> findById(String id) {
		return this.sceneRepository.findById(id);
	}
	
	public Scene save(Scene scene) {
		return this.sceneRepository.save(scene);
	}
	
	public void delete(Scene scene) {
		this.sceneRepository.delete(scene);
	}


}
