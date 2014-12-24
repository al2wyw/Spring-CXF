package com.techiekernel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.techiekernel.model.Customer;
import com.techiekernel.service.*;


@Component
public class FooBarWS {

	FooBarService fooBarService;
	CustomerQueryService customerQueryService;
 

	@GET
	@Path("/foobar/{param}")
	public Response getMessage(@PathParam("param") String msg) {
		return Response.status(200).entity(fooBarService.getMessage(msg)).build();
	}

	public FooBarService getFooBarService() {
		return fooBarService;
	}

	public void setFooBarService(FooBarService fooBarService) {
		this.fooBarService = fooBarService;
	}
	
	@GET
	@Path("/customer/xml/{id}")
	@Produces("application/xml")
	public Customer getCustomer(@PathParam("id") String id){
		Customer result = customerQueryService.getCustomerById(id);
		if (result == null){
			throw new WebApplicationException();
		}
		return result;
	}
	
	@GET
	@Path("/customer/json/{id}")
	@Produces("application/json")// string "123" to integer 123 ???
	public Customer getCustomerAsJson(@PathParam("id") String id){
		Customer result = customerQueryService.getCustomerById(id);
		if (result == null){
			throw new WebApplicationException();
		}
		return result;
	}
	
	public CustomerQueryService getCustomerQueryService() {
		return customerQueryService;
	}

	public void setCustomerQueryService(CustomerQueryService customerQueryService) {
		this.customerQueryService = customerQueryService;
	}
}
