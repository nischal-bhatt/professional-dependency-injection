package professional.di.controllers;

import org.springframework.stereotype.Controller;

import professional.di.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // no need annotation
	public ConstructorInjectedController(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	 public String getGreeting()
	    {
	    	return  greetingService.sayGreeting();
	    }
    
    
}
