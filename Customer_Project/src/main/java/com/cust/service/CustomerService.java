package com.cust.service;

import java.util.List;

import com.cust.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer custRequest);
	
	List<Customer> getCustomers();

	Customer updateCustomer(int id, Customer customerDetails);

	Customer deleteCustomer(int id, Customer customerDetails);

	void deleteCustomerDetails(int id);

	/*
	 * Customer deleteCustomer(int id, Customer customerDetails);
	 * 
	 * void deleteCustomerDetails(int id);
	 */
		/*
	 * var delete(int id);
	 * 
	 * var delete(int id, Customer customerDetails);
	 */

	//	void delete(int id);
	
	//Customer deleteCustomer(int id, Customer customerDetails);	
	//Delete<Customer> updateCustomerDetails();
	/*
	 * boolean delete(int id); Set<Customer> all();
	 * 
	 * void deletebyId(int id);
	 * 
	 * void deleteCustomerDetails(int id);
	 */


}
