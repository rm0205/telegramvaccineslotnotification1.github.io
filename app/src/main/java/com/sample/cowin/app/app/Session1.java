package com.sample.cowin.app.app;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Session1 {
	
	 private String session_id;
	 private String date;
	 private int available_capacity;
	 private int min_age_limit;
	 private String vaccine;
	 private List<String> slots;
	 private int available_capacity_dose1;
	 private int available_capacity_dose2;
	 
	 
	 public Session1()
	 {
		 
	 }
	 
	 
	public Session1(String session_id, String date, int available_capacity, int min_age_limit, String vaccine,
			List<String> slots, int available_capacity_dose1, int available_capacity_dose2) {
		super();
		this.session_id = session_id;
		this.date = date;
		this.available_capacity = available_capacity;
		this.min_age_limit = min_age_limit;
		this.vaccine = vaccine;
		this.slots = slots;
		this.available_capacity_dose1 = available_capacity_dose1;
		this.available_capacity_dose2 = available_capacity_dose2;
	}


	public String getSession_id() {
		return session_id;
	}


	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getAvailable_capacity() {
		return available_capacity;
	}


	public void setAvailable_capacity(int available_capacity) {
		this.available_capacity = available_capacity;
	}


	public int getMin_age_limit() {
		return min_age_limit;
	}


	public void setMin_age_limit(int min_age_limit) {
		this.min_age_limit = min_age_limit;
	}


	public String getVaccine() {
		return vaccine;
	}


	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}


	public List<String> getSlots() {
		return slots;
	}


	public void setSlots(List<String> slots) {
		this.slots = slots;
	}


	public int getAvailable_capacity_dose1() {
		return available_capacity_dose1;
	}


	public void setAvailable_capacity_dose1(int available_capacity_dose1) {
		this.available_capacity_dose1 = available_capacity_dose1;
	}


	public int getAvailable_capacity_dose2() {
		return available_capacity_dose2;
	}


	public void setAvailable_capacity_dose2(int available_capacity_dose2) {
		this.available_capacity_dose2 = available_capacity_dose2;
	}



	 
	
	 

}
