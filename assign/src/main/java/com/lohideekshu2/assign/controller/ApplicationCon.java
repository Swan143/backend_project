package com.lohideekshu2.assign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lohideekshu2.assign.entity.Application;
import com.lohideekshu2.assign.entity.SignUp;
import com.lohideekshu2.assign.service.ApplicationServ;
import com.lohideekshu2.assign.service.SignUpServ;


@RestController
@RequestMapping("application")
@CrossOrigin(origins ="*")
public class ApplicationCon {
	
	@Autowired
	public ApplicationServ as;
	
	@PostMapping
	public Application saveApplication(@RequestBody Application a) {
		System.out.println(a);
		return as.saveApplication(a);
		
	}
	@GetMapping
	public List<Application> getApplication() {
		return as.getApplication();
		
	}
	@PutMapping("/{id}")
	public Application updateApplication(@PathVariable("id") Long id, @RequestBody Application a) {
		return as.updateApplication(id, a);
	}
	@GetMapping("/{id}")
	public Application geid(@PathVariable Long id) {
		return as.geid(id);
	}
	@DeleteMapping("/{id}")
	public void deleteByid(@PathVariable Long id) {
		 as.deleteByid(id);
	}

}
