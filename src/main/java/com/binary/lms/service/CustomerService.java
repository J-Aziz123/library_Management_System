package com.binary.lms.service;

import java.util.List;

import com.binary.lms.model.Customer;

public interface CustomerService {
	
public Customer findCustomerById(int id);
    
    public List<Customer> findCustomerByLastName(String lastName);
    
    //public List<Customer> findCustomerByFirstName(String firstName);
    
    public Customer saveCustomer(Customer customer);
    
    public String deleteCustomerById(int id);
    
    public List<Customer> findAllCustomers();
    
    public Customer updateCustomer(int id, Customer customer);

}
