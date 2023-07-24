package com.tech.enitty;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.util.HibernateUtil;

public class Operation {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Employee e=new Employee();
		
		     // e.seteId(101);
		      e.seteName("Amol Aghav");
		      e.setAddrs("Pune");
		      e.setSalary(20000.00);
		      
		      session.save(e);
		      session.beginTransaction().commit();
		      
		      session.close();
		      sf.close();
		      
		      System.out.println("Dada Saved ");
		      
	}

}
