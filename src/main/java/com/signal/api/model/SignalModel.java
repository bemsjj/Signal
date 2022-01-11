package com.signal.api.model;

import java.util.Date;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class SignalModel {
	@Id
	private String Id;
	
	@Field
	private String nomType;
	
	@Field
	private String images;
	
	@Field
	private String nomRegion;
	
	@Field
	private Date dateSignal;
	
	@Field
	private String status;
	
	@Field
	private String description;

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public Date getDateSignal() {
		return dateSignal;
	}

	public void setDateSignal(Date dateSignal) {
		this.dateSignal = dateSignal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
}
