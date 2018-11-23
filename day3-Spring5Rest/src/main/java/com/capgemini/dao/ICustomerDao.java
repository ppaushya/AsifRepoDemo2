package com.capgemini.dao;

import java.util.List;

import org.cap.model.Customer;

public interface ICustomerDao {
	public List<Customer> getAllCustomers();

	public Customer findCustomer(Integer custId);

	public List<Customer> deleteCustomer(Integer custId);

	public List<Customer> createCustomer(Customer customer);

	public List<Customer> updateCustomer(Customer customer);
}
