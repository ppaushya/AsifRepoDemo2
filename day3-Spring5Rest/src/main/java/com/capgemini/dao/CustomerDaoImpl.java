package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("customerDao")
@Transactional
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customers= em.createQuery("from Customer").getResultList();
		
		return customers;
	}

	@Override
	public Customer findCustomer(Integer custId) {
		Customer customer=em.find(Customer.class, custId);
		return customer;
	}

	@Override
	public List<Customer> deleteCustomer(Integer custId) {
		Customer customer=em.find(Customer.class, custId);
		
		if(customer==null)
			return null;
		else
		{
			em.remove(customer);
			return getAllCustomers();
		}
	}
	
	@Override
	public List<Customer> createCustomer(Customer customer) {
		
		em.persist(customer);
		
		
		return getAllCustomers();
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		
		Customer customer2=em.find(Customer.class, customer.getCustomerId());
		
		if(customer2==null)
			em.persist(customer);
		else
			em.merge(customer);
		
		return getAllCustomers();
	}
	
}
