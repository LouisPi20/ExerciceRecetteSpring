package com.recette.exo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

	public RecetteModel findById(String id) {
		Optional<RecetteModel> optional = this.repo.findById(id);
		if (optional.isPresent()) return optional.get();
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VIDE");
	}
	
	public List<RecetteModel> findAllByNom(String nom){
		return this.repo.findAllByNom(nom);
	}

	public List<RecetteModel> findAllByDuree(long duree) {
		return this.repo.findAllByDuree(duree);
	}

	public List<RecetteModel> findAllByDificulte(String dificulte) {
		return this.repo.findAllByDificulte(dificulte);
		
	}
	
}
