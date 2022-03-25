package com.ravi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.entity.Customer;
import com.ravi.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository rep;
	
	@PostMapping(
			value="/customer",
			consumes= {"application/json"})
	public ResponseEntity<String>  customerdetails(@RequestBody Customer cust){
		System.out.println(cust); 
		rep.save(cust);
		return new ResponseEntity<>("Customer Created",HttpStatus.CREATED);
		
	}
	
	@GetMapping(
			value="/getall",
			produces= {"application/json"})
	public ResponseEntity<List<Customer>>  allcustomerdetails(){
		List<Customer> findAll = rep.findAll();
	
		return new ResponseEntity<>(findAll,HttpStatus.OK);
		
	}
	
	
}
