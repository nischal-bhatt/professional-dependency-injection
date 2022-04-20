package professional.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import professional.di.services.GreetingService;

@Controller
public class SetterInjectedController {

	 private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	  public String getGreeting()
	    {
	    	return  greetingService.sayGreeting();
	    }
     
	 

}
