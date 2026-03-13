package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentManager 
{
	public String insertData(Student s1)
	{
	 SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 Session se=sf.openSession();
	 se.getTransaction().begin();
	 se.persist(s1);
	 se.getTransaction().commit();
	 sf.close();
	 se.close();
	 return "Data was inserted Successfully";
		
	}

}
