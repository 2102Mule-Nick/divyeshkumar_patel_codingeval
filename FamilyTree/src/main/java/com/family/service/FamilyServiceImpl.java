package com.family.service;

import org.apache.log4j.Logger;

import com.family.dao.PersonDao;
import com.family.exception.PersonNotFound;
import com.family.pojo.Person;

public class FamilyServiceImpl implements FamilyService {

	Logger log = Logger.getRootLogger();
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public Person enterPerson(Person person) {
		// TODO Auto-generated method stub
		
		log.trace("enterPerson method - FamilyServiceImpl");
		try {
			personDao.enterPerson(person);
		}catch(PersonNotFound e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}
	public FamilyServiceImpl(PersonDao personDao) {
		super();
		this.personDao=personDao;
	}

}
