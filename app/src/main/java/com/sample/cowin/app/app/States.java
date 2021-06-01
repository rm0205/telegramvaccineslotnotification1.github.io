package com.sample.cowin.app.app;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
	

	@JsonProperty("states")
	private List<State> states;

	
	public List<State> getStates() {
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}

//
//	@Override
//	  public  String toString() {
//	    
//		return "States{" +
//	      	        ", states=" + states +
//	        '}';
//	  }
	
//	public List<String> StateName()
//	{
//		  List<String> list = new ArrayList<>();
//		  states.getClass(state);
//		return list;
//		  
//	}
	

}
