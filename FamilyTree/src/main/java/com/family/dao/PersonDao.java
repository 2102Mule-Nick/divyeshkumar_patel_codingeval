package com.family.dao;

import com.family.exception.PersonNotFound;
import com.family.pojo.Person;

public interface PersonDao {

	public void enterPerson(Person person) throws PersonNotFound;
	
	public void updatePerson(Person person);
	
	public Person getPersonbyName(String name) throws PersonNotFound;
	

}
