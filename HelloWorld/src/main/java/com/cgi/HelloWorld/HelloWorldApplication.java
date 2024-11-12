package com.cgi.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cgi.HelloWorld.controller.Product;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = 
		SpringApplication.run(HelloWorldApplication.class, args);
//		Product p = ctx.getBean(Product.class);
//		p.helloProuct();
	}

}
