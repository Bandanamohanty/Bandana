package com.niit.shoppingcart2backend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCategory {
	
	public static void main(String[] args) 
	
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart2backend.model");
		
		context.refresh();
		
		context.getBean("category");
		
		System.out.println("The Category instances is created successfully");
	}

}
