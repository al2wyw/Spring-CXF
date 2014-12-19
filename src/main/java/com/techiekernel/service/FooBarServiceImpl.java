package com.techiekernel.service;

import org.springframework.stereotype.Service;

@Service("fooBarService")
public class FooBarServiceImpl implements FooBarService{
	public String getMessage(String msg) {
 		String output = "FooBar say : " + msg;
 		return output;
 	}
}
