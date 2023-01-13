package com.lohideekshu2.assign.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lohideekshu2.assign.entity.SignUp;
@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Long> {

	SignUp findByEmailAndPassword(String email, String password);

//	List<Patient> findAll()
	

}
