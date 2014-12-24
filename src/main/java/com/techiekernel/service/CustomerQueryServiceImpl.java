package com.techiekernel.service;

import java.util.ArrayList;

import com.techiekernel.model.Customer;

import org.springframework.stereotype.Service;

@Service("customerQueryService")
public class CustomerQueryServiceImpl implements CustomerQueryService {
	private ArrayList<Customer> cuss;
	
	public CustomerQueryServiceImpl(){
		Customer a = new Customer();
		a.setId("123");
		a.setName("Peter");
		a.setSex("Male");
		Customer b = new Customer();
		b.setId("134");
		b.setName("Ken");
		b.setSex("Male");
		Customer c = new Customer();
		c.setId("045");
		c.setName("Anne");
		c.setSex("Female");
		cuss = new ArrayList<Customer>();
		cuss.add(a);
		cuss.add(b);
		cuss.add(c);
	}
	public Customer getCustomerById(String id) {
		for(Customer e:cuss){
			if(e.getId().equals(id))
				return e;
		}
		return null;
	}

	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerBySex(String sex) {
		// TODO Auto-generated method stub
		return null;
	}

}
