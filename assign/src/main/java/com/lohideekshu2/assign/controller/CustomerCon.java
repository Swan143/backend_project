//package com.lohideekshu2.assign.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lohideekshu2.assign.entity.Contact;
//import com.lohideekshu2.assign.entity.Customer1;
//import com.lohideekshu2.assign.repository.ContactRepo;
//import com.lohideekshu2.assign.repository.CustomerRepo;
//
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
//
//@RestController
//@RequestMapping("/customer")
//public class CustomerCon {
//	@Autowired
//	private CustomerRepo cr;
//	@Autowired
//	private ContactRepo cr1;
//	@PostMapping
//	public Customer1 saveCustomer(@RequestBody Customer1 cust) {
//		return cr.save(cust);
//	}
//	@GetMapping("{id}")
//		public Customer1 getCustomerbyid(@PathVariable Long id) {
//			return cr.findById(id).get();
//			
//		}
//	@GetMapping("/contact/{id}")
//	public Contact getContactbyid(@PathVariable Long id) {
//		return cr1.findById(id).get();
//		
//	}
//	@DeleteMapping("/{id}")
//	public String deleteCustomer(@PathVariable Long id) {
//		try {
//			cr.deleteById(id);
//			return "Records are deleted";
//		}
//		catch(Exception e) {
//			return "deletion failed"+e.getMessage();
//			
//		}
//		
//	}
//	
//	
//}
//
//
