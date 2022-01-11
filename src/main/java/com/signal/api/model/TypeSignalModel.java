package com.signal.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class TypeSignalModel {
	
	@Id
	private String Id;
	
	@Field
	private String nomType;

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	
}
