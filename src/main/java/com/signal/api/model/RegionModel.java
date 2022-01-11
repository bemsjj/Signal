package com.signal.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "regions")
public class RegionModel {
	@Id private String Id;
	
	@Field
	private String nomRegion;
	
	@Field
	private double longitude;
	
	@Field
	private double latitude;
	
	public RegionModel() {
	}

	public RegionModel(String nomRegion, double longitude, double latitude) {
		this.nomRegion = nomRegion;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	
}
