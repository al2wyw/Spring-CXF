package com.techiekernel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.techiekernel.service.*;

@Component
public class FooBarWS {

	FooBarService fooBarService;
 
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
	
}
