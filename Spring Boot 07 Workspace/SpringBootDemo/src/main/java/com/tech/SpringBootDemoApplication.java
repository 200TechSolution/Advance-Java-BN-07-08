package com.tech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tech.entity.Emplyee;
import com.tech.repo.MyRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ap = SpringApplication.run(SpringBootDemoApplication.class, args);

		MyRepository myrepo = ap.getBean(MyRepository.class);

		// single data
//		
//		Emplyee e = new Emplyee();
//		e.setE_Id(103);
//		e.setAddress("Nashik");
//		e.setFirsName("Ishwar");
//		e.setLastName("somase");
//		e.setSalary(30000.50);
//
//		Emplyee e1 = new Emplyee();
//		e1.setE_Id(104);
//		e1.setAddress("Pune");
//		e1.setFirsName("Mayur");
//		e1.setLastName("Jadhav");
//		e1.setSalary(30500.50);
//		 Emplyee emp = myrepo.save(e);
//		 System.out.println(emp);

		// save Multiple Data
		
		// List.of(e1,e2);
//		List<Emplyee> list = new ArrayList<Emplyee>();
//		list.add(e1);
//		list.add(e);
//		Iterable<Emplyee> allEmps = myrepo.saveAll(list);
//		allEmps.forEach(Emplyee -> System.out.println(Emplyee));
 

		//update Data

//		Optional<Emplyee>optional= myrepo.findById(104);
//		             
//		Emplyee emp= optional.get();
//		        
//		   emp.setSalary(40000.00);
//		   
//		   Emplyee update= myrepo.save(emp);
//		System.out.println(update);
//		
		//get Data
		
//		Optional<Emplyee> getData= myrepo.findById(101);
//		  Emplyee emplyee = getData.get();
//		  System.out.println(emplyee);
//		
	//	Iterable<Emplyee> iterable= myrepo.findAll();
		
		//Iterator<Emplyee>itr=iterable.iterator();
//		while(itr.hasNext())
//		{
//			Emplyee emp= itr.next();
//			System.out.println(emp);
//		}
//		
	 //	iterable.forEach(Emplyee-> {System.out.println(Emplyee);});
		
		//delete single Data
		
		//myrepo.deleteById(101);
		//System.out.println("Data Deleted");
		
		//delete All Deta
		
//		Iterable<Emplyee> emps = myrepo.findAll();
//		
//		emps.forEach(Emplyee->System.out.println(Emplyee));
//		
//		myrepo.deleteAll(emps);
//		
//		List<Emplyee> emps= myrepo.findBySalary(30000.5);
//		emps.forEach(Emplyee->System.out.println(Emplyee));
		
		
//	List<Emplyee>emps=myrepo.findByNameAndSalary("Yogesh Dhane", 50000);
//	emps.forEach(Emplyee->System.out.println(Emplyee));
//		
		
		List<Emplyee>emp=myrepo.getEmps();
		
		emp.forEach(Emplyee->System.out.println(Emplyee));
		
	}

}
