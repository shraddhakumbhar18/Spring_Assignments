package com.capgemini.spring.test;

import com.capgemini.spring.math.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main
{
	public static void main(String[] args)
	{	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(100,100);
		
		calculator.divide(200,100);
	}
}