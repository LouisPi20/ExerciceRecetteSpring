package com.recette.exo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.recette.exo.models.IngredientModel;
import com.recette.exo.models.RecetteModel;
import com.recette.exo.repositories.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository repo;

	@Autowired
	private RecetteService serviceRecette;

	public List<IngredientModel> findAll() {
		return this.repo.findAll();
	}

	public IngredientModel save(IngredientModel ingredient) {
		return this.repo.save(ingredient);
	}

	public IngredientModel findById(String id) {
		Optional<IngredientModel> optional = this.repo.findById(id);
		if (optional.isPresent())
			return optional.get();
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VIDE");

	}

	public List<RecetteModel> findByIngredient(String id) {
		IngredientModel ingredient = this.findById(id);
		return this.serviceRecette.findAllByIngredients(ingredient);

	}

}
