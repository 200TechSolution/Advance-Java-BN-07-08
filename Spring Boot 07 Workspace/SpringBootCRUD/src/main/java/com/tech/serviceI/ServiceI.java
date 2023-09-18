package com.tech.serviceI;

import java.util.List;
import java.util.Optional;

import com.tech.entity.College;

public interface ServiceI {
	
	public String saveData(College c);
	
	public String saveColleges(List<College> clgs);
	
	public Optional<College>  getCollege(String cid);
	
	public String deletecollege(String cid);

}
