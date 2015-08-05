package org.webapp.tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.webapp.resource.UserResource;

import com.ehr.data.User;

public class JunitUpdateUserTest {

	@Test
	public void test() {
		UserResource userRes = new UserResource();
		User updatedUser = new User();
		System.out.println("Enter id to update user");
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int id = s.nextInt();
		System.out.println("Enter name");
		String name = s1.nextLine();
		System.out.println("Enter password");
		String password = s2.nextLine();
		User user = userRes.getSingleUser(id);
		updatedUser.setName(name);
		updatedUser.setPassword(password);
		userRes.update(id, updatedUser);
		boolean res = false;
		if(user.getName()!=updatedUser.getName() && user.getPassword()!=updatedUser.getPassword()){
			res = true;
		}
		assertEquals(true,res);	
	}
}