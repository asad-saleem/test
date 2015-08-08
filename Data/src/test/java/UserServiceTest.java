package com.ehr.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ehr.dao.UserService;
import com.ehr.data.Registration;
import com.ehr.data.User;

/**
 * Junit tests of UserService Class
 * @author Asad
 *
 */
public class UserServiceTest {

	UserService user = new UserService();
	/** 
	 * Test to get user of {@link User} type from database
	 */
	@Test
	public void testGetAllUser() {
		int output = user.getAllUser().size();
		boolean out = output>0;
		assertEquals(true,out);
	}

	/**
	 * Test for get particular user of {@link User} type record from database through id
	 */
	@Test
	public void testGetUserData() {
		User getUser = user.getUserData(2);
		boolean result = false;
		if(getUser.getName() !="" && getUser.getPassword()!=""){
			result = true;
		}
		assertEquals(true,result);
	}

	/**
	 * Test for Add User of {@link User} type in database
	 */
	@Test
	public void testAddUser() {
		User newUser = new User(8,"Asad","abc");
		newUser = user.addUser(newUser);
		boolean output = false;
		if(newUser != null){
			output = true;
		}
		assertEquals(true,output);
	}

	/**
	 * Test for Delete User of {@link User} type from Database
	 */
	@Test
	public void testRemoveUser() {
		int sizeBeforeDelete = user.getAllUser().size();
		user.removeUser(3);
		int sizeAfterDelete = user.getAllUser().size();
		boolean result = false;
		if(sizeBeforeDelete==sizeAfterDelete+1){
			result = true;
		}
		assertEquals(true,result);
	}

	/**
	 * Test for Update User of {@link User} type in Database
	 */
	@Test
	public void testUpdateUser() {
		User updatedUser = new User();
		User oldUser = user.getUserData(1);
		String name = oldUser.getName();
		String password = oldUser.getPassword();
		updatedUser.setName("qaseem");
		updatedUser.setPassword("pak");
		updatedUser.setUserId(1);
		updatedUser = user.updateUser(updatedUser);
		boolean result = false;
		if(updatedUser.getName()!=name || updatedUser.getPassword()!=password){
			result = true;
		}
		assertEquals(true,result);	
	}

	/**
	 * Test for check that username exists in database
	 */
	@Test
	public void testCheckUserNameExistance() {
		String name = "Asad";
		boolean result = user.checkUserNameExistance(name);
		assertEquals(false, result);
	}

	/**
	 * Test for add a user of {@link Registration} type in database
	 */
	@Test
	public void testRegisterUser() {
		Registration register = new Registration();
		Registration reg = user.registerUser(register);
		boolean output = false;
		if(reg != null){
			output = true;
		}
		assertEquals(true, output);
	}
}