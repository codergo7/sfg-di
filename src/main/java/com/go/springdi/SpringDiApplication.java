package com.go.springdi;

import com.go.springdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		I18nController i18nController = ctx.getBean("i18nController", I18nController.class);

		System.out.println("______Profile______");

		System.out.println(i18nController.getGreeting());

		MyController myController = ctx.getBean("myController", MyController.class);

		System.out.println("______Primary Bean______");

		System.out.println(myController.sayHello());

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
