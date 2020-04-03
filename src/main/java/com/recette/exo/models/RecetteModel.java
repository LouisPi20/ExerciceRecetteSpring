package com.recette.exo.models;

import org.springframework.data.annotation.Id;
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
	
	
}
