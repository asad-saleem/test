package com.ehr.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ehr.data.Registration;
import com.ehr.data.User;

/**
 * RegistrationService class to add,delete new user
 * @author Asad
 *
 */
public class RegistrationService {

	SessionFactory sessionFactory = null;
	
	
	
	/**
	 * Add new user in Registration table  in Database
	 * @param newUser of {@link Registration} type
	 * @return object of {@link Registration} type
	 */
	public Registration addNewUser(Registration newUser){
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(newUser);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return newUser;
	}
	
	/**
	 * Get all users from database
	 * @param void
	 * @return {@link ArrayList} of {@link Registration} type
	 */
	public ArrayList<Registration> getAllUser(){
		ArrayList<Registration> users = new ArrayList<Registration>();
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			users = (ArrayList<Registration>) session.createCriteria(Registration.class).list();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return users;
	}
	
}
