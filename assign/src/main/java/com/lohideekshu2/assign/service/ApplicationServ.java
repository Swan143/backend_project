package com.lohideekshu2.assign.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lohideekshu2.assign.entity.Application;
import com.lohideekshu2.assign.entity.SignUp;

@Service
public interface ApplicationServ {

	Application saveApplication(Application a);

	List<Application> getApplication();

	Application updateApplication(Long id, Application a);

	Application geid(Long id);

	void deleteByid(Long id);
//	SignUp savePatient(SignUp p);
//
//	List<SignUp> getPatient();
//
//	SignUp updatePatient(Long id, SignUp p);
//
//	SignUp geid(Long id);
//
//	void deleteByid(Long id);
	


}
