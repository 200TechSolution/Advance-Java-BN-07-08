package com.tech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.College;
import com.tech.serviceI.ServiceI;

@RestController
public class CollegeController {

	@Autowired
	ServiceI si;

	@PostMapping("/college/add")
	public ResponseEntity<String> addCollege(@RequestBody College clg) {

		String resp = si.saveData(clg);

		return new ResponseEntity<String>(resp, HttpStatus.CREATED);

	}

	@PostMapping("colleges/add")
	public ResponseEntity<String> addColleges(@RequestBody List<College> clgs) {

		String resMessage = si.saveColleges(clgs);
		return new ResponseEntity<String>(resMessage, HttpStatus.CREATED);

	}

	@GetMapping("college/{cid}")
	public ResponseEntity<Object> getcollege(@PathVariable("cid") String cid) {
		 Optional<College> clg= si.getCollege(cid);

		if (clg.isPresent()) {
			return new ResponseEntity<Object>(clg, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<Object>("CollegeId :" + cid + " Does Not exist", HttpStatus.NOT_FOUND);

	}
	
	@DeleteMapping("college/{cid}")
	public ResponseEntity<String> deleteRecord(@PathVariable("cid") String cid)
	{
		String msg= si.deletecollege(cid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
