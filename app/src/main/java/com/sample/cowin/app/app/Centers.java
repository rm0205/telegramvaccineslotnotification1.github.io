package com.sample.cowin.app.app;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Centers {
	
	private List<Center> centers;
	

	
	public Centers()
	{
		
	}
	public Centers(List<Center> centers) {
		super();
		this.centers = centers;
	}
	public List<Center> getCenters() {
		return centers;
	}
	public void setCenters(List<Center> centers) {
		this.centers = centers;
	}
   
}
