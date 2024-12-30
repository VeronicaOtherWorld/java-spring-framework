package com.lulu.learningspringframework;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String sayHello() {
		return "Hello World";
	}

	@Bean
	public int age(){
		return 18;
	}

	@Bean
	public String name(){
		return "lulu";
	}

	@Bean
	public String address(){
		return "dublin";
	}
}
