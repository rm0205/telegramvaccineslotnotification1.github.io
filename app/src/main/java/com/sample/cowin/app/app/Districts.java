package com.sample.cowin.app.app;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Districts {
	
	
	@JsonProperty("districts")
	private List<District> districts;

	public Districts()
	{
		
	}
	
	public Districts(List<District> districts) {
		super();
		this.districts = districts;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	
	
	
	

}
