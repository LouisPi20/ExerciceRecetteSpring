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

import com.recette.exo.models.EtapeModel;
import com.recette.exo.models.RecetteModel;
import com.recette.exo.services.RecetteService;

@RestController
@CrossOrigin
@RequestMapping("recettes")
public class RecetteController {
	
	@Autowired
	private RecetteService service;
	
	@GetMapping("")
	public List<RecetteModel> findAll(){
	return this.service.findAll();
	}
	
	@PostMapping("")
	public RecetteModel save(@RequestBody RecetteModel recette) {
		return this.service.save(recette);
	}
	
	@GetMapping("{id}")
	public RecetteModel findById(@PathVariable String id){
		return this.service.findById(id);
		
	}
	
	@GetMapping("nom/{nom}")
	public List<RecetteModel> findAllByNom(@PathVariable String nom){
		return this.service.findAllByNom(nom);
	}
	
	@GetMapping("duree/{duree}")
	public List<RecetteModel> findAllByDuree(@PathVariable long duree){
		return this.service.findAllByDuree(duree);
	}
	
	@GetMapping("dificulte/{dificulte}")
	public List<RecetteModel> findAllByDificulte(@PathVariable String dificulte){
		return this.service.findAllByDificulte(dificulte);
	}
	
	@GetMapping("duree/min/{min}/max/{max}")
	public List<RecetteModel> findAllByDureeBetween(@PathVariable long min, long max) {
		return this.service.findAllByDureeBetween(min, max);
	}
	@GetMapping("duree/plage/{plage}")
	public List<RecetteModel> findAllByDureeBetween(@PathVariable String plage) {
		return this.service.findAllByDureeBetween(plage);	
	}
	
	@GetMapping("{id}/ingredients/{idI}")
	public RecetteModel findByIdRI(@PathVariable String id, String idI) {
		return this.service.addIngredient(id, idI);
	}
	
	@PostMapping("{id}/etapes")
	public RecetteModel addEtapes(@PathVariable String id, @RequestBody EtapeModel etapes) {
		return this.service.addEtapes(id, etapes);
	}
}
