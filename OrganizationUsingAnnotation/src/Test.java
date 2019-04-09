package com.capgemini.spring.test;
import com.capgemini.spring.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization organization = (Organization) context.getBean("organization");
		Address address = (Address) context.getBean("address");
		System.out.println("Organization Details are:" + organization.toString());
		System.out.println("Address is:" + address.toString());
	}
}