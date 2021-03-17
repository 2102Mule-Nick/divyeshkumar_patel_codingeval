package com.family.service;

import com.family.exception.PersonNotFound;
import com.family.pojo.Person;

public interface FamilyService {

	public Person enterPerson(Person person) throws PersonNotFound;
	public boolean updatePerson(Person person);

}
