package com.accolite.soap;

import javax.jws.WebService;

@WebService(endpointInterface="com.accolite.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldString(String service) {
		// TODO Auto-generated method stub
		return "Hello" + service;
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "I'm " + name;
	}

}