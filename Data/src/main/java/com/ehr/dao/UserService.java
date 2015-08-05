package com.ehr.dao;

import java.util.ArrayList;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

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
		User user = new User();
		try{
        	sessionFactory = new Configuration().configure().buildSessionFactory();
        	session = sessionFactory.openSession();
        	session.beginTransaction();
    		user = (User)session.get(User.class, new Integer(id));
    		session.delete(user);
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
}