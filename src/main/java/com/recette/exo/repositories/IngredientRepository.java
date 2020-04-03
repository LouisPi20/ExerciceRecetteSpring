package com.recette.exo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recette.exo.models.IngredientModel;

public interface IngredientRepository extends MongoRepository <IngredientModel, String> {
}
