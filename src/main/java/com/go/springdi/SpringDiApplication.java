package com.go.springdi;

import com.go.springdi.controller.ConstructorInjectedController;
import com.go.springdi.controller.MyController;
import com.go.springdi.controller.PropertyInjectedController;
import com.go.springdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		MyController myController = ctx.getBean("myController", MyController.class);

		String greeting = myController.sqyHello();

		System.out.println(greeting);

		System.out.println("______Property______");

		PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController",PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("______Setter______");

		SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController",SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("______Constructor______");

		ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController",ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
