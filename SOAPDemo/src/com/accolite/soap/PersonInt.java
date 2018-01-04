/**
 * 
 */
package com.accolite.soap;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Hyderabad Intern
 *
 */

@WebService
@SOAPBinding(style=Style.RPC)
public interface PersonInt {
	void createPerson(String Name, int age);
	void deletePerson(String Name);
	void updatePerson(String Name, int age);
	String getPerson(String Name);
	Person[] getPersons();
}
