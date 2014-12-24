package com.techiekernel.service;

import com.techiekernel.model.Customer;

public interface CustomerQueryService {
	Customer getCustomerById(String id);
	Customer getCustomerByName(String name);
	Customer getCustomerBySex(String sex);
}
