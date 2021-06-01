package com.sample.cowin.app.app;

import java.util.Arrays;
import java.util.List;

import org.apache.http.protocol.HTTP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ServiceLayer(RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
	}
	
	public States consumeApi()
	{
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    ResponseEntity<States> response = restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/admin/location/states",HttpMethod.GET, entity,States.class);
		
	    States result = response.getBody();
	    
	  
	    return result;
		
		
	}
	
	public Districts consumeApi1(int state_id)
	{
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    ResponseEntity<Districts>  response= restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/admin/location/districts/" + state_id,HttpMethod.GET, entity,Districts.class);
		
	 Districts result = response.getBody();
	    
	  
	    return result;
		
		
	}
	public Sessions consumeApi2(int district_id,String date)
	{
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    ResponseEntity<Sessions>  response= restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByDistrict" +"?" + "district_id" + "=" + district_id + "&" + "date"+ "="+date,HttpMethod.GET, entity,Sessions.class);
		
	 Sessions result = response.getBody();
	    
	  
	    return result;
		
		
	}
	
	public String consumeApi3(String textSend)
	{
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    ResponseEntity<String>  response= restTemplate.exchange("https://api.telegram.org/"enter telegrambot token"/sendMessage?chat_id=-486539652&text="+textSend,HttpMethod.POST, entity,String.class);
		
	 String result = response.getBody();
	    
	  
	    return result;
		
		
	}
	public Centers consumeApi4(int district_id,String date)
	{
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	    ResponseEntity<Centers>  response= restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByDistrict"+"?" + "district_id" + "=" + district_id + "&" + "date"+ "="+date,HttpMethod.GET, entity,Centers.class);
		
	 Centers result = response.getBody();
	    
	  
	    return result;
		
		
	}
	


}

