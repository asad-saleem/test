package org.webapp.tests;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.webapp.resource.UserResource;

public class JunitDeleteUserTest {

	@Test
	public void test() {
		UserResource userRes = new UserResource();
		System.out.println("Enter id to delete");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		int sizeBeforeDelete = userRes.get().size();
		userRes.deleteUser(id);
		int sizeAfterDelete = userRes.get().size();
		boolean result = false;
		if(sizeBeforeDelete==sizeAfterDelete+1){
			result = true;
		}
		assertEquals(true,result);
	}

}
