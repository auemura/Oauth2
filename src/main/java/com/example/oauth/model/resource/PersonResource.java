package com.example.oauth.model.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oauth.model.Person;
import com.example.oauth.model.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonResource {
	
	@Autowired
	private PersonRepository repository;
	
	@GetMapping
	public List<Person> listar(){
		return this.repository.findAll();
	}

}
