package com.family;

import java.util.Scanner;

import com.family.dao.PersonDao;
import com.family.dao.PersonDaoPostgres;
import com.family.service.FamilyService;
import com.family.service.FamilyServiceImpl;
import com.family.ui.DisplayMenu;
import com.family.ui.Menu;
import com.family.ui.RegisterMenu;
import com.family.ui.WelcomeMenu;

public class MainPage {
	
	public MainPage() {

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PersonDao personDao = new PersonDaoPostgres();
		FamilyService familyService = new FamilyServiceImpl(personDao);

		Menu register = new RegisterMenu();
		Menu display = new DisplayMenu();

		Menu welcomeMenu = new WelcomeMenu(register, display);

		((RegisterMenu) register).setWelcomeMenu(welcomeMenu);
		((RegisterMenu) register).setFamilyService(familyService);

		register.setScanner(scan);
		display.setScanner(scan);

		Menu nextMenu = welcomeMenu;
		do {
			nextMenu.displayOptions();
			nextMenu = nextMenu.advance();
		} while (nextMenu != null);

	}

}
