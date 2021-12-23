package com.example.demogcp2; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
	
	@Autowired
	private DBServiceClient dbServiceClient;

	public List<Customer> findAllCustomer() {	
		return dbServiceClient.getCustomers();
	}

	public Customer findCustomerById(Integer id) {	
		return dbServiceClient.getCustomerById(id);
	}
	
	public void save(Customer customer) {
		dbServiceClient.saveCustomer(customer);
	}

	
}
