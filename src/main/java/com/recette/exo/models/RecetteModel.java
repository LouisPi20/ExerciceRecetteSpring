package com.recette.exo.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class RecetteModel {

	@Id
	private String id;
	
	private String nom; 
	private long duree;
	private String dificulte; 
	
	private List<EtapeModel> etapesASuivre = new ArrayList<EtapeModel>();
	
	@DBRef
	private List<IngredientModel> ingredients = new ArrayList<IngredientModel>();
	
	
	
}
