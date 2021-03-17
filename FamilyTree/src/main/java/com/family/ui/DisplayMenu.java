package com.family.ui;

import java.util.Scanner;

public class DisplayMenu implements Menu {
	
	private Scanner scan;
	private Menu nextMenu;
	private Menu welcomeMenu;
	

	public DisplayMenu() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayOptions() {
		System.out.println("The family info:");
		nextMenu = welcomeMenu;

	}

	@Override
	public Menu advance() {
		// TODO Auto-generated method stub
		return nextMenu;
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
	public DisplayMenu(Menu welcomeMenu) {
		super();
		this.welcomeMenu=welcomeMenu;
	}

}
