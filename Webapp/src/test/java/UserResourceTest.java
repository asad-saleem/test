package org.webapp.resource.test;

import static org.junit.Assert.*;


import org.junit.Test;
import org.webapp.resource.UserResource;

import com.ehr.data.User;

/**
 * Junit tests of UserResource Class
 * @author Asad
 *
 */
public class UserResourceTest {

	UserResource user = new UserResource();
	
	/**
	 * Test to get users object of {@link User} type
	 */
	@Test
	public void testGet() {
		int output = user.get().size();
		boolean out = output>0;
		assertEquals(true,out);	
	}

	/**
	 * Test for get particular user object of {@link User} type record from database through id
	 */
	@Test
	public void testGetSingleUser() {
		User getUser = user.getSingleUser(5);
		boolean result = false;
		if(getUser.getName() !="" && getUser.getPassword()!=""){
			result = true;
		}
		assertEquals(true,result);
	}

	/**
	 * Test for Add User object of {@link User} type in database
	 */
	@Test
	public void testAddUser() {
		User newUser = new User(7,"Asad","abc");
		newUser = user.addUser(newUser);
		boolean output = false;
		if(newUser != null){
			output = true;
		}
		assertEquals(true,output);
	}

	/**
	 * Test for Delete User object of {@link User} type from Database
	 */
	@Test
	public void testDeleteUser() {
		int sizeBeforeDelete = user.get().size();
		user.deleteUser(7);
		int sizeAfterDelete = user.get().size();
		boolean result = false;
		if(sizeBeforeDelete==sizeAfterDelete+1){
			result = true;
		}
		assertEquals(true,result);
	}

	/**
	 * Test for Update User object of {@link User} type in Database
	 */
	@Test
	public void testUpdate() {
		User updatedUser = new User();
		User oldUser = user.getSingleUser(1);
		String name = oldUser.getName();
		String password = oldUser.getPassword();
		updatedUser.setName("qaseem");
		updatedUser.setPassword("pak");
		updatedUser = user.update(1, updatedUser);
		boolean result = false;
		if(updatedUser.getName()!=name || updatedUser.getPassword()!=password){
			result = true;
		}
		assertEquals(true,result);	
	}

}
