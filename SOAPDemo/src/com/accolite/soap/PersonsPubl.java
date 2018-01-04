package com.accolite.soap;

import java.util.ArrayList;

import javax.xml.ws.Endpoint;

public class PersonsPubl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/person?wsdl", new PersonImpl());
	}
}
