package org.cap.service;

import java.util.List;

import org.cap.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ICustomerDao;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer findCustomer(Integer custId) {
		// TODO Auto-generated method stub
		return customerDao.findCustomer(custId);
	}

	@Override
	public List<Customer> deleteCustomer(Integer custId) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(custId);
	}

	@Override
	public List<Customer> createCustomer(Customer customer) {
		
		return customerDao.createCustomer(customer);
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		
		return customerDao.updateCustomer(customer) ;
	}

}
