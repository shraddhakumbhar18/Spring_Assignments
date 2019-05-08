package com.capgemini.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.spring.mvc.model.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/new")
	public String addNewPerson(@RequestParam("personId") int personId, 
			@RequestParam("PersonName") String personName)
	{
		return "";
		
	}
}
