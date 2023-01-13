//package com.lohideekshu2.assign.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//@Entity
//public class Contact {
//	public Long getContactId() {
//		return contactId;
//	}
//
//	public void setContactId(Long contactId) {
//		this.contactId = contactId;
//	}
//
//	public String getAddressType() {
//		return addressType;
//	}
//
//	public void setAddressType(String addressType) {
//		this.addressType = addressType;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public Customer1 getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer1 customer) {
//		this.customer = customer;
//	}
//
//	public Contact(Long contactId, String addressType, String address, Customer1 customer) {
//		super();
//		this.contactId = contactId;
//		this.addressType = addressType;
//		this.address = address;
//		this.customer = customer;
//	}
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long contactId;
//	private String addressType;
//	private String address;
//	
//	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name="cust_id")
//	@JsonBackReference
//	private Customer1 customer;
//
//	@Override
//	public String toString() {
//		return "Contact [contactId=" + contactId + ", addressType=" + addressType + ", address=" + address
//				+ ", customer=" + customer + "]";
//	}
//
//	public Contact() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//
//}
