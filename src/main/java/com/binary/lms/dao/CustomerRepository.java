package com.binary.lms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.binary.lms.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	    public List<Customer> findByLastName(String lastName);

	    
	}



