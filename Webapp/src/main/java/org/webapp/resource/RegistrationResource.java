package org.webapp.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ehr.dao.RegistrationService;
import com.ehr.data.Registration;
import com.ehr.data.User;

import javax.ws.rs.core.MediaType;

@Path("newusers")
public class RegistrationResource {
	RegistrationService newUser = new RegistrationService();
	
	/**
	 * return all users from database
	 * {@link ArrayList} of type {@link Registration}
	 * @return
	 */
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Registration> getAllUser(){
		return newUser.getAllUser();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Registration addNewUser(Registration newRegisterUser){
		return newUser.addNewUser(newRegisterUser);
	}
}
