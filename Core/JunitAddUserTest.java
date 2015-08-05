package org.webapp.tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.webapp.resource.UserResource;

import com.ehr.dao.UserService;
import com.ehr.data.User;

public class JunitAddUserTest {

	@Test
	public void test() {
		UserResource userRes = new UserResource();
		System.out.println("Enter id");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		System.out.println("Enter name");
		Scanner s1 = new Scanner(System.in);
		String name = s1.nextLine();
		System.out.println("Enter password");
		Scanner s2 = new Scanner(System.in);
		String password = s2.nextLine();
		User newUser = new User(5,"Asad","abc");
		User user = userRes.addUser(newUser);
		boolean output = false;
		if(user != null){
			output = true;
		}
		assertEquals(true,output);
	}

}
