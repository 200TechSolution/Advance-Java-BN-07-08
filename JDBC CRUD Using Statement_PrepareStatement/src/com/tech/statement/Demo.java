package com.tech.statement;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		
		
		 t.add("B");
		 t.add("A"); 
		 t.add("C");
		 System.out.println(t);

		System.out.println("A".compareTo("B"));//-1
		System.out.println("B".compareTo("A"));//1
		System.out.println("A".compareTo("A"));//0

	}

}
