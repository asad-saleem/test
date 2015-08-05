package org.webapp.tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.webapp.resource.UserResource;

import com.ehr.data.User;

public class JunitGetSingleUserTest {

	@Test
	public void test() {
		UserResource userRes = new UserResource();
		System.out.println("Enter id");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		User user = userRes.getSingleUser(id);
		boolean result = false;
		if(user.getName() !="" && user.getPassword()!=""){
			result = true;
		}
		assertEquals(true,result);
	}

}
