package com.tech.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

public class Intitilizer implements WebApplicationInitializer

{


	@Override
	public void onStartup(ServletContext sc) throws ServletException {
 AnnotationConfigWebApplicationContext acwac=new AnnotationConfigWebApplicationContext();
 acwac.register(Appconfig.class);
 acwac.setServletContext(sc);
 ServletRegistration.Dynamic sdy=sc.addServlet("DispatcherServlet",new DispatcherServlet(acwac));
 sdy.addMapping("/");
		
	} 

}
