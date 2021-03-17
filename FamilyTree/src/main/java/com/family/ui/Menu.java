package com.family.ui;

import java.util.Scanner;

public interface Menu {

	public Menu advance();

	public void displayOptions();

	public Scanner getScanner();

	public void setScanner(Scanner scan);

}
