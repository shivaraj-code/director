package com.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cust.model.Customer;
import com.cust.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping("/welcome")
	public String echo() {
		
		return "Welcome to My World";
	}

	@PostMapping("/customer/add")
	public ResponseEntity<String> createCustomer(@RequestBody Customer custRequest) {

		Customer customer = customerService.createCustomer(custRequest);

		return ResponseEntity.status(201).body("Customer Details Created Successfully" + customer.getId());
	}

	@GetMapping("/customer/list")
	public List<Customer> getCustomers() {

		return customerService.getCustomers();
	}

	@PutMapping("/customer/edit/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable int id, @RequestBody Customer customerDetails) {
		Customer customer = customerService.updateCustomer(id, customerDetails);

		return ResponseEntity.status(201).body("Customer Details updated Successfully with Id " + customer.getId());
	}

	@DeleteMapping(value = "/customer/delete/{id}")
	public ResponseEntity<String> deleteCustomerDetails(@PathVariable int id) {
		customerService.deleteCustomerDetails(id);
		return ResponseEntity.status(200).body("Customer Details Deleted Successfully... ");

	}

	/*
	 * @DeleteMapping(value="/customer/delete/{id}") public ResponseEntity<String>
	 * deleteCustomer(@PathVariable int id) {
	 * 
	 * 
	 * isRemoved = customerService.deleteCustomerDetails(id);
	 * 
	 * if(customer.equals(id)) { customerService.deletebyId(id);
	 * ResponseEntity<String>(customer.delete(), HttpStatus.OK); } else
	 * ResponseEntity<String>(HttpStatus.NOT_FOUND);
	 * 
	 * return
	 * ResponseEntity.status(201).body("Customer Details Deleted Successfully "); }
	 */
}
