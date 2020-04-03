package com.recette.exo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recette.exo.models.IngredientModel;
import com.recette.exo.models.RecetteModel;

public interface RecetteRepository extends MongoRepository <RecetteModel, String> {
		
	public List<RecetteModel> findAllByNom(String nom);
	public List<RecetteModel> findAllByDuree(long duree);
	public List<RecetteModel> findAllByDificulte(String dificulte);
	public List<RecetteModel> findAllByDureeBetween(long min, long max);
	public List<RecetteModel> findAllByIngredients(IngredientModel ingredients);
	
}
