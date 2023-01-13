package com.lohideekshu2.assign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lohideekshu2.assign.entity.SignUp;


public interface SignUpServ {

	SignUp saveUser(SignUp p);

	List<SignUp> getUser();

	SignUp updateUser(Long id, SignUp p);

	SignUp geid(Long id);

	void deleteByid(Long id);
	
	
	SignUp findByEmailAndPassword(String email, String password);

}
