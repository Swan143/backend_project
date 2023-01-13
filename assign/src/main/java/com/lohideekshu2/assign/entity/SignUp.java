package com.lohideekshu2.assign.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class SignUp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long user_id;
	String firstName;
	String lastName;
	String email;
	String phone;

	String password;
	String contry;
	
//	cascade=CascadeType.ALL
//	
//	@JsonManagedReference
//	@OneToOne(cascade=CascadeType.ALL, mappedBy="user")
//	Application application;
	


	@Override
	public String toString() {
		return "SignUp [user_id=" + user_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", contry=" + contry + ", application=" +
				"]";
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUp(Long user_id, String firstName, String lastName, String email, String phone, String password,
			String contry,Application application) {
		super();
		this.user_id = user_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.contry = contry;
//		this.application = application;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
//	public Application getApplication() {
//		return application;
//	}
//	public void setApplication(Application application) {
//		this.application = application;
//	}
	
	

	
}
