package com.recette.exo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recette.exo.models.RecetteModel;

	public interface RecetteRepository extends MongoRepository <RecetteModel, String> {
		
	}
