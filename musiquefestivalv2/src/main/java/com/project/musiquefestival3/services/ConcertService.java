package com.project.musiquefestival3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.musiquefestival3.entities.Concert;
import com.project.musiquefestival3.repositories.ConcertRepository;


@Service

public class ConcertService {
	private ConcertRepository concertRepository;
	
	
	public ConcertService(ConcertRepository concertRepository) {
		this.concertRepository = concertRepository;
	}

	public List<Concert> findAll(){
		return this.concertRepository.findAll();
	}

	public Concert findByTitre(String titre) {
		return this.concertRepository.findByTitre(titre);
	}
	
	public Concert save(Concert concert) {
		return this.concertRepository.save(concert);
	}
	
	public void delete(Concert concert) {
		this.concertRepository.delete(concert);
	}

}
