/**
 * 
 */
package com.accolite.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * @author Hyderabad Intern
 *
 */
@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloWorld {
	String getHelloWorldString(String service);
	String getName(String name);
}
