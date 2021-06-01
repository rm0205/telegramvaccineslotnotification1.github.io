//package com.sample.cowin.app.app;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@RestController
//public class ConsumeWebService {
//
//	@Autowired
//	  RestTemplate restTemplate;
//
//	   @RequestMapping(value = "/location/states")
//	   public String getProductList() {
//	      HttpHeaders headers = new HttpHeaders();
//	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	      headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//	     HttpEntity <String> entity = new HttpEntity<String>(headers);
////	      RestTemplate restTemplate = new RestTemplate();
////	      ResponseEntity<List<states>> response = restTemplate.exchange(
////	        "https://cdn-api.co-vin.in/api/v2/admin/location/states",
////	        HttpMethod.GET,
////	        entity,
////	        new ParameterizedTypeReference<List<states>>(){});
////	      List<states> employees = response.getBody();
////	      return employees;
//  return  restTemplate.exchange("https://cdn-api.co-vin.in/api/v2/admin/location/states", HttpMethod.GET, entity, String.class).getBody();
////	       return statelist;
//	    	   }
//}
