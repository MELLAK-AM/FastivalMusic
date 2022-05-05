package com.project.musiquefestival3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.musiquefestival3.entities.Festival;
import com.project.musiquefestival3.repositories.FestivalRepository;

@Service
public class FestivalService {
	
private FestivalRepository festivalRepository;
	
	public FestivalService (FestivalRepository festivalRepository) {
		this.festivalRepository = festivalRepository;
	}

	public Festival findByNom(String nom) {
		return this.festivalRepository.findByNom(nom);
	}
	
	public List<Festival> findAll(){
		return this.festivalRepository.findAll();
	}

	public Optional<Festival> findById(String id) {
		return this.festivalRepository.findById(id);
	}
	
	public Festival save(Festival festival) {
		return this.festivalRepository.save(festival);
	}
	
	public void delete(Festival festival) {
		this.festivalRepository.delete(festival);
	}
	
}
