package org.webapp.resource;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ehr.dao.UserService;
import com.ehr.data.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Path ("users")
public class UserResource {
	
	ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
	UserService user  = (UserService)context.getBean("user_service");
	
	
	/* return all users from database */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> get(){
		return user.getAllUser();
	}
	
	/* return all users from database with (all) in url */
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("all")
	public ArrayList<User> getUserDetail(){
		return user.getAllUser();
	}
	
	/* Return a particular user by its id */
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{userId}")
	public User getSingleUser(@PathParam("userId") int id){
		return user.getUserData(id);

	}
	
	/* Add a user in database */
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User addUser(User user1){
		return user.addUser(user1);
	}
	
	/* Delete a user from database */
	
	@DELETE
	@Path("{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUser(@PathParam("userId") int id){
		user.removeUser(id);
	}
	
	/* Update a user in database */
	
	@PUT
	@Path("{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User update(@PathParam("userId") int id, User us){
		us.setUserId(id);
		return user.updateUser(us);
	}
}