package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tech.model.Account;
import com.tech.servicei.ServiceI;

@Controller
public class MyController {
	
	@Autowired
	ServiceI si;
	
	
	@RequestMapping("/reg")
	public String saveData(Account ac)
	{
		int cid=si.saveData(ac);
		
		if(cid>0)
		{
			return"index";
		}
		else
		{
		return "register";
		}
		
	}
  
	
	@RequestMapping("/log")
	public String getData(@RequestParam("user") String us,@RequestParam("pass")String pass,Account  ac)
	 {
		if(us.equals("admin" )&& pass.equals("b07"))
		{
	    	List<Account>aclist=	si.loginCheck(us, pass);
	    	for(Account ac1:aclist)
	    	{
	    		System.out.println(ac1.getC_Name());
	    		System.out.println(ac1.getAddress());
	    	}
		}
		return pass;
		 
	 }
}
