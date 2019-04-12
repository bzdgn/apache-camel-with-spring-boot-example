package com.bzdgn.camelex.services;

import org.springframework.stereotype.Service;

import com.bzdgn.camelex.model.Person;

@Service
public class PersonProcessorImpl implements PersonProcessor {

	@Override
	public void processPerson(Person person) {
    	person.setId(person.getId()*10);
    	person.setName("Name: " + person.getName());
    	person.setCity("City:" + person.getCity());
    	person.setCountry("Country: " + person.getCountry());
    	person.setMarried(!person.isMarried());
	}

}
