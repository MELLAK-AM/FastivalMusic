package com.project.musiquefestival3.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.musiquefestival3.entities.Scene;
import com.project.musiquefestival3.services.SceneService;

@RestController
@RequestMapping("scene")
public class SceneController {
	
SceneService service;
	
	public SceneController(SceneService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("scenes")
	public List<Scene> findAll(){
		return service.findAll();
	}
	
	@GetMapping("scenes/{id}")
	public Optional<Scene> findById(@PathVariable String id) {
		return this.service.findById(id);
	}
	
	@PostMapping("scene")
	public Scene save(@RequestBody Scene scene) {
		return this.service.save(scene);
	}
	
	@PutMapping("scene")
	public Scene update(@RequestBody Scene scene) {
		return this.service.save(scene);
	}
	
	@DeleteMapping("scene")
	public void delete(@RequestBody Scene scene) {
		this.service.delete(scene);
	}


}
