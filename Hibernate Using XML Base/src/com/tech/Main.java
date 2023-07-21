package com.tech;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registory=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources msd=new MetadataSources(registory);
		
		Metadata md=msd.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		//Transaction  tx=session.beginTransaction();
		
		Student stu=new Student();
		
		   stu.setsId(105);
		   stu.setsName("Amol Salunke");
		   stu.setAddrs("Mumbai");
		   stu.setEmail("amol123@gmail.com");
		   
		   session.save(stu);
		   
		   session.beginTransaction().commit();
		   System.out.println("Data Saved Succedfullay in database");
		   
		}
	

}
