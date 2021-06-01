package com.sample.cowin.app.app;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sessions {
	
	List<Session> sessions;

	
	public Sessions()
	{
		
	}
	public Sessions(List<Session> sessions) {
		super();
		this.sessions = sessions;
	}
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
	
	

}
