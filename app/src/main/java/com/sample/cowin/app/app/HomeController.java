package com.sample.cowin.app.app;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class HomeController {
	
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping("/index")
    public String viewHomePage() {
        return "index";
    }
	
		

	
	
	
	@GetMapping(value="/states")
	public ModelAndView getData()
	{

	States statesList=serviceLayer.consumeApi();
		ModelAndView model=new ModelAndView("indiastate");
         model.addObject("statesList" , statesList.getStates());
        // getData1(state);
        model.addObject("stateName", new State());
         return model;		 
	}

	@GetMapping(value="/stating_data")
	public ModelAndView SetData(@ModelAttribute(value="stateName")State state)
	{
	     
		
		ModelAndView model=new ModelAndView("indiastate");
		
		//System.out.println(state.getState_id());
		
		
		return getData1(state.getState_id());
		
	}
	
	@RequestMapping(value="/district/{state_id}")
	public  ModelAndView getData1(@PathVariable("state_id") int state_id)
	{
         	
		  ModelAndView model=new ModelAndView("indiastate");
		  model.addObject("districtName", serviceLayer.consumeApi1(state_id).getDistricts());
		  model.addObject("districName", new District());
		  String date = null;
		  model.addObject("date", date);
          return model;
            
//		System.out.println(serviceLayer.consumeApi1(state_id));
//		
	}
	@GetMapping(value="/district_data")
	public ModelAndView SetData1(@ModelAttribute(value="districName")District disti, @ModelAttribute(value="date") String date)
	{
	     
		System.out.println(date);
		//ModelAndView model=new ModelAndView("indiastate");
		 String[] datenew=date.split("-");
	
		 date="";
		 for(int i=datenew.length-1;i>=0;i--)
		 {
			  
			   date=date+datenew[i];
			   if(i>0)
				   date=date+"-";
		 }
		 System.out.println(date);
		  
		System.out.println(disti.getDistrict_id());
		
		
		ModelAndView model=new ModelAndView("states_india");
		
		return GetDisData(disti.getDistrict_id(),date);
		
		
		
		
	}
	
	@GetMapping(value="/find_dis/{district_id}/{date}")
	public ModelAndView GetDisData(@PathVariable("district_id") int district_id, @PathVariable("date") String date)
	{
		
		ModelAndView model=new ModelAndView("states_india");
		model.addObject("sessionName", new Session());
		model.addObject("slotList", serviceLayer.consumeApi2(district_id,date).getSessions());
		return model;
	  //return serviceLayer.consumeApi2(district_id,date).getSessions();	
	}
	
	@PostMapping(value="/telegramnotifier1")
	public List<Session> SendDatato() throws ParseException
	{
		
		
		List<Integer> stateid=new ArrayList<>();
		List<State> state=serviceLayer.consumeApi().getStates();
        for(int i=0;i<state.size();i++)
        {
        	stateid.add(state.get(i).getState_id());
        }
        List<District> dis=serviceLayer.consumeApi1(34).getDistricts();
        String sourceDate = "30-05-2021";  // Start date

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(sourceDate)); // parsed date and setting to calendar

        calendar.add(Calendar.DATE, 1);  // number of days to add
        String destDate = sdf.format(calendar.getTime());  // End date
        System.out.println(destDate);
        List<Integer> districtid=new ArrayList<>();
        for(int i=0;i<dis.size();i++)
        {
        	districtid.add(dis.get(i).getDistrict_id());
        }
        List<Session> sessionVac=serviceLayer.consumeApi2(631, destDate).getSessions();
		return sessionVac;
		
		
		
	}
	@PostMapping(value="/telegramnotifier")
	public String SendTelegramData(String textSend)
	{
		 
		return serviceLayer.consumeApi3(textSend);
		
	}
	
	@GetMapping(value="/calenderby")
	public void GetDataCalender() throws ParseException, InterruptedException
	{
		String sourceDate = "30-05-2021";  // Start date

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(sourceDate)); // parsed date and setting to calendar

        calendar.add(Calendar.DATE, 1);  // number of days to add
        String destDate = sdf.format(calendar.getTime());  // End date
        System.out.println(destDate);
		List<Center> center=serviceLayer.consumeApi4(631,destDate).getCenters();
		System.out.println(center.get(0).getSessions().size());
		
//		List<Integer> list=new ArrayList<>();
//		for(int i=0;i<center.size();i++)
//		{
//			 list.add(center.get(i).getSessions().get(i).getAvailable_capacity());
//		}
		//return list;
		
		for(int i=0;i<center.size();i++)
		{
			if(center.get(i).getSessions().get(0).getAvailable_capacity()>=5)
			{
				String textSend="StateName - " +  center.get(i).getState_name() + System.lineSeparator() + "DistrictName - " + center.get(i).getDistrict_name() + System.lineSeparator() + "Vaccine Center - " + center.get(i).getName()  +  System.lineSeparator() +"Address - " +  center.get(i).getAddress() + System.lineSeparator() + "VaccineName - " + center.get(i).getSessions().get(0).getVaccine() + System.lineSeparator() +"VaccineCapacity - " + center.get(i).getSessions().get(0).getAvailable_capacity() +System.lineSeparator()+ "Minimum_Age_Limit - " +center.get(i).getSessions().get(0).getMin_age_limit() + System.lineSeparator()+"Vaccine Timings - " + center.get(i).getFrom() + "to" + ' '+ center.get(i).getTo();
				
				SendTelegramData(textSend);
			}
			TimeUnit.SECONDS.sleep(3);
		}
		
		
		
		
	}
	
	
}
 