package com.recette.exo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recette.exo.models.IngredientModel;
import com.recette.exo.services.IngredientService;

@RestController
@CrossOrigin
@RequestMapping("ingredients")
public class IngredientContoller {
	
	@Autowired IngredientService service;
	
	@GetMapping("")
	public List<IngredientModel> findAll(){
		return this.service.findAll();	
	}
	
	@PostMapping("")
	public IngredientModel save(@RequestBody IngredientModel ingredient) {
		return this.service.save(ingredient);
		
	}
	
	@GetMapping("{id}")
	public IngredientModel findById(@PathVariable String id) {
		return this.service.findById(id);
	}

}
