package org.cap.service;

import java.util.List;

import org.cap.model.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomers();

	public Customer findCustomer(Integer custId);

	public List<Customer> deleteCustomer(Integer custId);

	public List<Customer> createCustomer(Customer customer);

	public List<Customer> updateCustomer(Customer customer);
}
