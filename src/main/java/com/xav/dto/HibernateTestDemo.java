package com.xav.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateTestDemo {
	
	public static void main(String args[]){
		
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(1);
		userDetails.setUserName("abc");
		
		// Create Session Factory Object using Annotation Configuration
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();  
    
      //Create Session object from session factory object
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
      //Use the session to save model objects
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();

		
	}

}
