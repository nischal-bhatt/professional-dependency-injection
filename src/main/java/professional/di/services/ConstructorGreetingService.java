package professional.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "HelloWorld - constructor";
	}

}
