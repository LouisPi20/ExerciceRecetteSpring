package com.recette.exo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recette.exo.models.RecetteModel;
import com.recette.exo.repositories.RecetteRepository;

@Service
public class RecetteService {
	
	@Autowired
	private RecetteRepository repo;
	
	public List<RecetteModel> findAll(){
		return this.repo.findAll();	
	}
	
	public RecetteModel save(RecetteModel recette) {
		return this.repo.save(recette);
		
	}
}
