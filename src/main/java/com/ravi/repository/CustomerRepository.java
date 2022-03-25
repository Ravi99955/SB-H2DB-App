package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.entity.Customer;



public interface CustomerRepository  extends JpaRepository<Customer,Integer>{

	
}
