package com.family.ui;

import java.util.Scanner;

import com.family.exception.PersonNotFound;
import com.family.pojo.Person;
import com.family.service.FamilyService;
import com.family.service.FamilyServiceImpl;

public class RegisterMenu implements Menu{
	
	private Scanner scan;
	private FamilyService familyService;
	private Menu nextMenu;
	private Menu welcomeMenu;
	
	

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public Menu getNextMenu() {
		return nextMenu;
	}

	public void setNextMenu(Menu nextMenu) {
		this.nextMenu = nextMenu;
	}

	public RegisterMenu() {
		super();
	}

	@Override
	public void displayOptions() {
		
		Person person = new Person();
		System.out.println("Enter firstName: ");
		person.setFirstName(scan.nextLine());
		
		System.out.println("Enter Father's Name:");
		person.setFathersName(scan.nextLine());
		
		System.out.println("Enter Mother's Name:");
		person.setMothersName(scan.nextLine());
		
		System.out.println("Enter your gender: (Male/ Female) only:");
		person.setGender(scan.nextLine());
		try {
			familyService.enterPerson(person);
			nextMenu = welcomeMenu;
		}catch(PersonNotFound e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Menu advance() {
		return nextMenu;
		// TODO Auto-generated method stub
		
	}

	public FamilyService getFamilyService() {
		return familyService;
	}

	public void setFamilyService(FamilyService familyService) {
		this.familyService = familyService;
	}


	public Menu getWelcomeMenu() {
		return welcomeMenu;
	}

	public void setWelcomeMenu(Menu welcomeMenu) {
		this.welcomeMenu = welcomeMenu;
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return this.scan;
	}

	@Override
	public void setScanner(Scanner scan) {
		this.scan=scan;
		
	}
	public RegisterMenu(FamilyService familyService) {
		super();
		this.familyService = familyService;
	}

}
