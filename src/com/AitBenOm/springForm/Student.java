package com.AitBenOm.springForm;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName, lastName, country;
	
	private String[] countries = {"Morocco", "Germany", "Switzerland", "Italy"};
	private LinkedHashMap<String, String> countryList;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCountry() {
		return country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student() {
		/*countryList = new LinkedHashMap<>();
		for (int i=0; i< this.countries.length; i++) {
			countryList.put(this.countries[i],this.countries[i] );
		}*/
		
		// TODO Auto-generated constructor stub
	}
	

}
