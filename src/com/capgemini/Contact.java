package com.capgemini;

public class Contact{
	
	//variables
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;
	
    
	//setters
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
		}
	public void setAddress(String address){
		this.address = address;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setZip(String zip){
		this.zip = zip;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public void setEmail(String email){
		this.email = email;
	}
	//getters
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getAddress(){
		return this.address;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public String getZip(){
		return this.zip;
	}
	public String getPhoneNo(){
		return this.phoneNo;
	}
	public String getEmail(){
		return this.email;
	}
	
	@Override
	public String toString(){
		return "The contact details of " + firstName + " " + lastName + " has been added.";
	}
}
	
	
	