package com.tech.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@EnableWebMvc
@ComponentScan(basePackages = "com.tech")
@Configuration
public class Appconfig {
	@Bean
	public  InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}
	   @Bean
		public DriverManagerDataSource dmds()
		{
			DriverManagerDataSource d=new DriverManagerDataSource();
			d.setDriverClassName("com.mysql.jdbc.Driver");
			d.setUrl("jdbc:mysql://localhost:3306/springmvccrud07");
			d.setUsername("root");
			d.setPassword("root");
			return d;
			
		}
	   @Bean
	   public LocalSessionFactoryBean sf()
	   {
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(dmds());
		Properties p=new Properties();
		p.setProperty("org.hibernate.dialect.MySQL55Dialect","hibernate.dialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		lsfb.setHibernateProperties(p);
		lsfb.setAnnotatedClasses(com.tech.model.Account.class);
		
		return lsfb;
		
	   }
	}


