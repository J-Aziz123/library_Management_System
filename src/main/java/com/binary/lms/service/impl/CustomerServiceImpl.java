package com.binary.lms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binary.lms.dao.CustomerRepository;
import com.binary.lms.exceptions.CustomerNotFoundException;
import com.binary.lms.model.Customer;
import com.binary.lms.service.CustomerService;


	
	
	
	@Service
	public class CustomerServiceImpl implements CustomerService {

	    @Autowired
	    private CustomerRepository customerRepository;

	    @Override
	    public Customer findCustomerById(int id) {
	        Optional<Customer> customer = customerRepository.findById(id);
	        if (customer.isPresent()) {
	            return customer.get();
	        } else {
	            throw new CustomerNotFoundException("Customer not found with id: " + id);
	        }
	    }

	    @Override
	    public List<Customer> findCustomerByLastName(String lastName) {
	        return customerRepository.findByLastName(lastName);
	    }

	    // @Override
	    // public List<Customer> findCustomerByFirstName(String firstName) {
	    //     return customerRepository.findByFirstName(firstName);
	    // }

	    @Override
	    public Customer saveCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }

	    @Override
	    public String deleteCustomerById(int id) {
	        customerRepository.deleteById(id);
	        return "Customer deleted with id: " + id;
	    }

	    @Override
	    public List<Customer> findAllCustomers() {
	        return (List<Customer>) customerRepository.findAll();
	    }

	    @Override
	    public Customer updateCustomer(int id, Customer customer) {
	        Optional<Customer> existingCustomer = customerRepository.findById(id);
	        if (existingCustomer.isPresent()) {
	            customer.setId(id);
	            return customerRepository.save(customer);
	        } else {
	            throw new CustomerNotFoundException("Customer not found with id: " + id);
	        }
	    }
	}


