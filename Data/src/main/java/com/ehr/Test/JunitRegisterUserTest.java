package com.ehr.dao.tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import com.ehr.dao.UserService;
import com.ehr.data.Registration;

public class JunitRegisterUserTest {

	@Test
	public void test() {
		//Registration userReg = new Registration(2,"aa","a","a",20,"pak","rwp","ddf","add","123","456","789","male","asd","123","123");

		//System.out.println("Enter id");
		//Scanner s = new Scanner(System.in);
		//nt id = s.nextInt();
		System.out.println("Enter name");
		Scanner s1 = new Scanner(System.in);
		String name = s1.nextLine();
		System.out.println("Enter first name");
		Scanner s2 = new Scanner(System.in);
		String firstName = s2.nextLine();
		System.out.println("Enter last name");
		Scanner s3 = new Scanner(System.in);
		String lastName = s3.nextLine();
		System.out.println("Enter age");
		Scanner s4 = new Scanner(System.in);
		int age = s4.nextInt();
		System.out.println("Enter country");
		Scanner s5 = new Scanner(System.in);
		String country = s5.nextLine();
		
		System.out.println("Enter city");
		Scanner s6 = new Scanner(System.in);
		String city = s6.nextLine();
		System.out.println("Enter email");
		Scanner s7 = new Scanner(System.in);
		String email = s7.nextLine();
		System.out.println("Enter postal address");
		Scanner s8 = new Scanner(System.in);
		String postelAddress = s8.nextLine();
		System.out.println("Enter contact1");
		Scanner s9 = new Scanner(System.in);
		String contact1 = s9.nextLine();
		System.out.println("Enter contact2");
		Scanner s10 = new Scanner(System.in);
		String contact2 = s10.nextLine();
		
		System.out.println("Enter contact3");
		Scanner s11 = new Scanner(System.in);
		String contact3 = s11.nextLine();
		System.out.println("Enter gender");
		Scanner s12 = new Scanner(System.in);
		String gender = s12.nextLine();
		System.out.println("Enter user name");
		Scanner s13 = new Scanner(System.in);
		String userName = s13.nextLine();
		System.out.println("Enter password");
		Scanner s14 = new Scanner(System.in);
		String password = s14.nextLine();
		System.out.println("Enter re-enter password");
		Scanner s15 = new Scanner(System.in);
		String rePassword = s15.nextLine();
		
		UserService user = new UserService();
		Registration reg = user.registerUser(name, firstName, lastName, age, country, city, email, postelAddress, contact1, contact2, contact3, gender, userName, password, rePassword);
		boolean output = false;
		if(reg != null){
			output = true;
		}
		assertEquals(true, output);
	}

}
