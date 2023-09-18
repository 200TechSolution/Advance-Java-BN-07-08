package com.tech.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.College;
import com.tech.repository.CollegeRepo;
import com.tech.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	CollegeRepo repo;

	@Override
	public String saveData(College c) {

		repo.save(c);

		return "CollegeId :" + c.getC_Id() + " Added Successfully";
	}

	@Override
	public String saveColleges(List<College> clgs) {

		repo.saveAll(clgs);

		return "All colleges Saved Successfully";
	}

	@Override
	public Optional<College>getCollege(String cid) {

		Optional<College> getclg = repo.findById(cid);

	
		return getclg;

	}

	@Override
	public String deletecollege(String cid) {
		
		repo.deleteById(cid);
		
		return "Data deleted Successfully";
	}

}
