package com.family.pojo;

public class Person {

	private String firstName;
	private String lastName;
	private String mothersName;
	private String fathersName;
	private String gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Person() {
		super();
		
	}

	public Person(String firstName, String lastName, String gender, String fathersName, String mothersName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
	}
}
