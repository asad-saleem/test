package com.ehr.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String firstName;
	private String lastName;
	private int age;
	private String country;
	private String city;
	private String email;
	private String postalAdress;
	private String contact1;
	private String contact2;
	private String contact3;
	private String gander;
	private String userName;
	private String password;
	private String reEnterPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostalAdress() {
		return postalAdress;
	}
	public void setPostalAdress(String postalAdress) {
		this.postalAdress = postalAdress;
	}
	public String getContact1() {
		return contact1;
	}
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	public String getContact2() {
		return contact2;
	}
	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}
	public String getContact3() {
		return contact3;
	}
	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReEnterPassword() {
		return reEnterPassword;
	}
	public void setReEnterPassword(String reEnterPassword) {
		this.reEnterPassword = reEnterPassword;
	}
}
