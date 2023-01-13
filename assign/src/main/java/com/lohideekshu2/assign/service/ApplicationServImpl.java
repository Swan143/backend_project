package com.lohideekshu2.assign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lohideekshu2.assign.entity.Application;
import com.lohideekshu2.assign.entity.SignUp;
import com.lohideekshu2.assign.repository.ApplicationRepo;
import com.lohideekshu2.assign.repository.SignUpRepo;

@Service
public class ApplicationServImpl implements ApplicationServ {
	
	@Autowired
	private ApplicationRepo dr;

	public Application saveApplication(Application a) {
		// TODO Auto-generated method stub
		return dr.save(a);
	}

	public List<Application> getApplication() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	public Application updateApplication(Long id, Application a) {
		// TODO Auto-generated method stub
		return dr.save(a);
	}

	public Application geid(Long id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

	public void deleteByid(Long id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
		
	}
	

//	public Patient savePatient(Patient p) {
//		// TODO Auto-generated method stub
//		return pr.save(p);
//	}


}
