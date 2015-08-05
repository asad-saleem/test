package com.ehr.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table (name = "logindetail")
public class User {
	@Id
	int userId;
	String name;
	String password;
	
	public void setUserId(int i){
		this.userId = i;
	}
	public int getUserId(){
		return userId;
	}
	public void setName(String name){
		this.name  = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPassword(String pass){
		this.password = pass;
	}
	public String getPassword(){
		return password;
	}
}