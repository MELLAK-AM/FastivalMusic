package com.project.musiquefestival3.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.musiquefestival3.entities.Festival;
import com.project.musiquefestival3.services.FestivalService;

@RestController
@RequestMapping("festival")
public class FestivalController {
	
	private FestivalService service;
	
	@GetMapping("/hello-world")
	public String HelloWorld(){
		return "Hello World";
	}
	
	public FestivalController(FestivalService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("festival")
	public List<Festival> findAll(){
		return service.findAll();
	}
	
	@GetMapping("festivals/{nom}")
	public Festival findById(@PathVariable String nom) {
		return this.service.findByNom(nom);
	}
	
	@PostMapping("festival")
	public Festival save(@RequestBody Festival festival) {
		return this.service.save(festival);
	}
	
	@PutMapping("festival")
	public Festival update(@RequestBody Festival festival) {
		return this.service.save(festival);
	}
	
	@DeleteMapping("festival")
	public void delete(@RequestBody Festival festival) {
		this.service.delete(festival);
	}
}