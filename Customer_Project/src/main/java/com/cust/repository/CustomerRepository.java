package com.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cust.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//@Query("delete from Customer where id=:id")
	//void deletecustomerbyid(int id);

}
