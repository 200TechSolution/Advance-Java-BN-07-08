package com.tech.repo;

import java.util.List;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tech.entity.Emplyee;


@Repository
public interface MyRepository  extends CrudRepository<Emplyee, Integer>{
	
	public List<Emplyee>findBySalary(double salary);
	
	public List<Emplyee>findByFirsNameAndLastName(String firstName,String lastName);
	
	public List<Emplyee>findByFirsNameOrSalary(String firstName,double salary);
	
	public List<Emplyee>findByFirsNameStartingWith(String prifix);

    public List<Emplyee>findBySalaryLessThan(double salary);
    
    public List<Emplyee>findByFirsNameContaining(String words);
    
    @Query("select e from Emplyee e")
    public List<Emplyee>getAllEmployees();
    
    
    @Query("select e from Emplyee e where e.firsName=:n  and e.lastName=:l")
    public List<Emplyee>getEmployeesByName( @Param("n") String name ,@Param("l")String lastName);
    
    
    @Query(value="select * from emplyee",nativeQuery =true)
    public List<Emplyee>getEmps();
    
    
    
    
}
