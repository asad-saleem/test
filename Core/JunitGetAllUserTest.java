package org.webapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.webapp.resource.UserResource;

public class JunitGetAllUserTest {

	@Test
	public void test() {
		UserResource user = new UserResource();
		int output = user.get().size();
		boolean out = output>0;
		assertEquals(true,out);
	}

}
