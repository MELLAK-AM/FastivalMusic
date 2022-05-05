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

import com.project.musiquefestival3.entities.Concert;
import com.project.musiquefestival3.services.ConcertService;

@RestController
@RequestMapping("concert")
public class ConcertController {
    
	ConcertService service;
	
	public ConcertController(ConcertService service) {
		super();
		this.service= service;
	}
	
	@GetMapping("concerts")
	public List<Concert> findAll(){
		return service.findAll();
	}
	
	@GetMapping("concerts/{titre}")
	public Concert findByTitre(@PathVariable String titre) {
		return this.service.findByTitre(titre);
	}
	
	@PostMapping("concert")
	public Concert save(@RequestBody Concert concert) {
		return  this.service.save(concert);
	}
	
	@PutMapping("concert")
	public Concert update(@RequestBody Concert concert) {
		return this.service.save(concert);
	}
	
	@DeleteMapping("concert")
	public void delete(@RequestBody Concert concert) {
		this.service.delete(concert);
	}

	

}
