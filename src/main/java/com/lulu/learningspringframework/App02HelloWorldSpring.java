package com.lulu.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
	// 	1.launch a spring context
		var applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	// 	2.configure the things that we want spring to manage -@configuration
	// 	helloworldconfiguration - @ configuration
	// 	sayHello - @Beans
		applicationContext.getBean("sayHello");
		// 3.retrieving Beans managed by spring
		System.out.println(applicationContext.getBean("sayHello"));
		System.out.println(applicationContext.getBean("age"));
		System.out.println(applicationContext.getBean("name"));
		System.out.println(applicationContext.getBean("address"));
	}
}
