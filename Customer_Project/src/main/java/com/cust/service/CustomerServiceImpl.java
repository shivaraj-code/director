package com.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.model.Customer;
import com.cust.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer custRequest) {
		// TODO Auto-generated method stub
		return customerRepository.save(custRequest);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(int id, Customer customerDetails) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.getById(id);

		customer.setCustname(customerDetails.getCustname());
		customer.setCustaddress(customerDetails.getCustaddress());
		customer.setCustmail(customerDetails.getCustmail());
		customer.setCustphone(customerDetails.getCustphone());

		return customerRepository.save(customer);
	}

	@Override 
	public Customer deleteCustomer(int id, Customer customerDetails) {
	// TODO Auto-generated method stub 
		return null; 
		}

	@Override public void deleteCustomerDetails(int id) { 	  
		 // TODO Auto-generated method stub
		customerRepository.deleteById(id);
	  
	  }

	/*
	 * @Override public Set<Customer> all() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public void deletebyId(int id) { // TODO Auto-generated method stub
	 * customerRepository.deleteById(id); }
	 * 
	 * @Override public boolean delete(int id) {
	 * 
	 * var isRemoved = this.posts.removeIf(post -> post.getId().equals(id)); return
	 * isRemoved; }
	 * 
	 */
	/*
	 * @Override public var delete(int id, Customer customerDetails) { Customer
	 * customer = CustomerRepository.getById(id); // TODO Auto-generated method stub
	 * return (var) ResponseEntity.status(201).
	 * body("Customer Details Deleted Successfully with Id " +customer.getId()); }
	 * 
	 * @Override public Customer deleteCustomer(int id, Customer customerDetails) {
	 * // TODO Auto-generated method stub return ; }
	 * 
	 * @Override public var delete(int id) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 */ /*
		 * @Override public Customer deleteCustomer(int id, Customer customerDetails) {
		 * // TODO Auto-generated method stub Customer customer =
		 * CustomerRepository.getById(id);
		 * 
		 * customer.setCustname(customerDetails.getCustname());
		 * customer.setCustaddress(customerDetails.getCustaddress());
		 * customer.setCustmail(customerDetails.getCustmail());
		 * customer.setCustphone(customerDetails.getCustphone());
		 * 
		 * return CustomerRepository.save(customer); }
		 */

}
