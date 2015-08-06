package com.ehr.dao;

import java.util.ArrayList;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import com.ehr.data.Registration;
import com.ehr.data.User;

public class UserService{
	SessionFactory sessionFactory = null;
	Session session = null;
	
	/* Get all users from database */

	public ArrayList<User> getAllUser(){
		ArrayList<User> users = new ArrayList<User>();
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			users = (ArrayList<User>) session.createCriteria(User.class).list();
			session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return users;
	}
	
	/* get particular user record from database through id */
	
	public User getUserData(int id){
		User user = new User();
        String name=null;
        try{
        	sessionFactory = new Configuration().configure().buildSessionFactory();
        	session = sessionFactory.openSession();
        	session.beginTransaction();
        	user = (User)session.get(User.class, new Integer(id));
        	session.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
        return user;
	}
	
	
	
	/* Add User in database */
	
	public User addUser(User u){
        try{
        	sessionFactory = new Configuration().configure().buildSessionFactory();
        	session = sessionFactory.openSession();
        	session.beginTransaction();
        	session.beginTransaction();
        	session.save(u);
        	session.getTransaction().commit();
        	session.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
		return u;
	}
	
	/* Delete User from Database */
	
	public void removeUser(int id){
		//User user = new User();
		try{
        	sessionFactory = new Configuration().configure().buildSessionFactory();
        	session = sessionFactory.openSession();
        	session.beginTransaction();
    		//user = (User)session.get(User.class, new Integer(id));
    		session.delete(session.get(User.class, new Integer(id)));
        	session.getTransaction().commit();
        	session.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	/* Update User in Database */
	
	public User updateUser(User user){
		if(user.getUserId() <= 0){
			return null;
		}
		try{
        	sessionFactory = new Configuration().configure().buildSessionFactory();
        	session = sessionFactory.openSession();
        	session.beginTransaction();
    		session.update(user);
    		session.getTransaction().commit();
    		session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return user;
	}
	public boolean checkUserNameExistance(String name){
		User user = new User();	
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		ArrayList<User> users = new ArrayList<User>();
		users = (ArrayList<User>) s.createCriteria(User.class).list();
		int count=0;
		for(int i=1; i<=users.size(); i++){
			user=(User) s.get(User.class, i);
			if(name.equals(user.getName())){	
				count++;
			}
		}
		if(count==0){
		SessionFactory session_factory = new Configuration().configure().buildSessionFactory();
		
		Session session = session_factory.openSession();
		
		session.beginTransaction();
		user.setName(name);
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();
		return true;
		}
	if(count>0){
		System.out.println("Name already exists");
		return false;
		}
		return true;
	}
	
	public void registerUser(int id, String name,String firstName, String lastName,int age, String country, String city, String email, String postelAddress, String contact1, String contact2, String contact3, String gender,String userName, String password, String rePassword){
		Registration registration = new Registration();
		
		registration.setName(name);
		registration.setAge(age);
		registration.setCity(city);
		registration.setContact1(contact1);
		registration.setContact2(contact2);
		registration.setContact3(contact3);
		registration.setCountry(country);
		registration.setEmail(email);
		registration.setFirstName(firstName);
		registration.setGander(gender);
		registration.setLastName(lastName);
		registration.setPassword(password);
		registration.setPostalAdress(postelAddress);
		registration.setReEnterPassword(rePassword);
		registration.setUserName(userName);
	
		
		SessionFactory session_factory = new Configuration().configure().buildSessionFactory();
		
		Session session = session_factory.openSession();
		
		session.beginTransaction();
		session.save(registration);
	
		session.getTransaction().commit();
	
		session.close();
	}
}