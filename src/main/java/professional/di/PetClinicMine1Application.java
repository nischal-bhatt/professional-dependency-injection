package professional.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import professional.di.controllers.ConstructorInjectedController;
import professional.di.controllers.I18nController;
import professional.di.controllers.MyController;
import professional.di.controllers.PropertyInjectedController;
import professional.di.controllers.SetterInjectedController;

@SpringBootApplication
public class PetClinicMine1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PetClinicMine1Application.class, args);

		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		MyController myController = (MyController) ctx.getBean("myController");
	
		System.out.println("----primary");
		System.out.println(myController.sayHello());

		System.out.println("----property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}