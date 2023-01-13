package com.lohideekshu2.assign.entity;

import java.sql.Clob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;


@Entity
public class Application {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long application_id;
	@NotNull
	String firstname;
	String lastname;
	String email;
	String dob;
	String mobile;
	String address;
	int zip;

	String city;
	String state;
	double experience;
	String education;
	String twevlthPercent;
	String password;
	Clob resume;
//	
//	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@JoinColumn(name="user_id")
//	
//	SignUp user;
	
	@Override
	public String toString() {
		return "Application [application_id=" + application_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", dob=" + dob + ", mobile=" + mobile + ", address=" + address + ", zip=" + zip
				+ ", city=" + city + ", state=" + state + ", experience=" + experience + ", education=" + education
				+ ", twevlthPercent=" + twevlthPercent + ", password=" + password + ", resume=" + resume + ", user="
				+ "]";
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(Long application_id, String firstname, String lastname, String email, String dob, String mobile,
			String address, int zip, String city, String state, double experience, String education,
			String twevlthPercent, Clob resume,SignUp user) {
		super();
		this.application_id = application_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.experience = experience;
		this.education = education;
		this.twevlthPercent = twevlthPercent;
		this.resume = resume;
//		this.user = user;

	}

	public Long getApplication_id() {
		return application_id;
	}
	public void setApplication_id(Long application_id) {
		this.application_id = application_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getTwevlthPercent() {
		return twevlthPercent;
	}
	public void setTwevlthPercent(String twevlthPercent) {
		this.twevlthPercent = twevlthPercent;
	}
	public Clob getResume() {
		return resume;
	}
	public void setResume(Clob resume) {
		this.resume = resume;
	}

//	public SignUp getUser() {
//		return user;
//	}
//	public void setUser(SignUp user) {
//		this.user = user;
//	}
//	public Application(SignUp user) {
//		super();
//		
//	}

	
	
	
	
	
	
}