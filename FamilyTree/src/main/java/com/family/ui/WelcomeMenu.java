package com.family.ui;

import java.util.Scanner;

public class WelcomeMenu implements Menu {

	private Scanner scan;
	private Menu nextMenu;
	private Menu registerMenu;
	private Menu displayMenu;

	public WelcomeMenu() {
		super();
	}

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextMenu;
	}

	@Override
	public void displayOptions() {
		
		System.out.println("Welcome to Family");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("1. Add new person to family");
		System.out.println("2. View Family");
		System.out.println("3. Update Person in Family");
		System.out.println("Please select an option");
		System.out.println("-=-=-=-==-==-=-=--=");
		String answer = scan.nextLine();

		if ("1".equals(answer)) {
			nextMenu = registerMenu;
		} else if ("2".equals(answer)) {
			nextMenu = displayMenu;
		} else {
			System.out.println("Please provide a valid input");
			nextMenu = this;
		}
	}

	@Override
	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return this.scan;
	}

	@Override
	public void setScanner(Scanner scan) {
		this.scan = scan;

	}

	public WelcomeMenu(Menu registerMenu, Menu displayMenu) {
		super();
		this.registerMenu = registerMenu;
		this.displayMenu = displayMenu;
	}
}
