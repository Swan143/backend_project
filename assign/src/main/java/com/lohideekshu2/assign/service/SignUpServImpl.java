package com.lohideekshu2.assign.service;

//import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lohideekshu2.assign.entity.SignUp;
import com.lohideekshu2.assign.repository.SignUpRepo;

@Service
public class SignUpServImpl implements SignUpServ{
	
	
	@Autowired
	private SignUpRepo sr;



	public SignUp saveUser(SignUp p) {
		// TODO Auto-generated method stub
		return sr.save(p);
	}

	public List<SignUp> getUser() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	public SignUp updateUser(Long id, SignUp p) {
		// TODO Auto-generated method stub
		return sr.save(p);
	}

	public SignUp geid(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	public void deleteByid(Long id) {
		// TODO Auto-generated method 
		sr.deleteById(id);
		
	}

	public SignUp findByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
//		SignUp signUp = pr.loginValidation(email, password);
		return sr.findByEmailAndPassword(email, password);
	}

//	public List<SignUp> getUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public SignUp findByEmailAndPassword(String email, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	}
	


