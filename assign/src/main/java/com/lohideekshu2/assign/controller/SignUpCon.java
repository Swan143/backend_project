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

import com.lohideekshu2.assign.entity.SignUp;
import com.lohideekshu2.assign.service.SignUpServ;

//import antlr.collections.List;

@RestController
@RequestMapping("/signup")
@CrossOrigin(origins ="*")
public class SignUpCon {
	
	@Autowired
	private SignUpServ ps;
//	private BCryptPasswordEncoder pass;
	
	@PostMapping
	public SignUp saveUser(@RequestBody SignUp sp) {
		System.out.println(sp);
		return ps.saveUser(sp);
	}
	@GetMapping
	public List<SignUp> getUser() {
		return ps.getUser();
		
	}
	@PutMapping("/{id}")
	public SignUp updateUser(@PathVariable("id") Long id, @RequestBody SignUp sp) {
		return ps.updateUser(id, sp);
	}
	@GetMapping("/{id}")
	public SignUp geid(@PathVariable Long id) {
		return ps.geid(id);
	}
	@DeleteMapping("/{id}")
	public void deleteByid(@PathVariable Long id) {
		 ps.deleteByid(id);
	}
//	public SignUp loginValidation(@RequestBody SignUp signup) {
//		
//		String pwd = signup.getPassword();
//		return ps.lo;
//		
//	}
	@GetMapping("/{email}/{password}")
	public SignUp findByEmailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password) {
		System.out.println(ps.findByEmailAndPassword(email, password));
		return ps.findByEmailAndPassword(email, password);
	}
	

}






















































































//
//
//
//
//
//
//
//
//
//
//
//



