package org.cap.controller;

import java.util.List;

import org.cap.model.Customer;
import org.cap.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")	//any domain can access my spring server
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	
	@GetMapping(value="/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers= customerService.getAllCustomers();
		
		if(customers.isEmpty())
			return new ResponseEntity
					("Sorry! Customer list not available!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	
	
	
	
	@DeleteMapping(value="/customers/{custId}")
	public ResponseEntity<List<Customer>>deletCustomer(
			@PathVariable("custId")Integer custId){
		List<Customer> customers= customerService.deleteCustomer(custId);
		
		if(customers==null)
			return new ResponseEntity
					("Sorry! Customer Id not available!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

	
	@GetMapping(value="/customers/{custId}")
	public ResponseEntity<Customer> findCustomers(
			@PathVariable("custId")Integer custId){
		Customer customer= customerService.findCustomer(custId);
		
		if(customer==null)
			return new ResponseEntity
					("Sorry! Customer ID does not exists!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@PostMapping(value="/customers",produces="application/json")
	public ResponseEntity<List<Customer>> createCustomer(
			@RequestBody Customer customer){
		
		List<Customer> customers=customerService.createCustomer(customer);
		
		if(customers.isEmpty())
			return new ResponseEntity("Sorry! Insertion failed", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);	
		
	}
	
	
	@PutMapping("/customers")
	public ResponseEntity<List<Customer>> updateCustomer(
			@RequestBody Customer customer){
		
		List<Customer> customers=customerService.updateCustomer(customer);
		
		if(customers.isEmpty())
			return new ResponseEntity("Sorry! Insertion failed", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);	
		
	}
	
}
