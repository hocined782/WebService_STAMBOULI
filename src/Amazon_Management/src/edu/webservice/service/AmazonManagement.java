package edu.webservice.service;

/**
* @authors DJEBRI & STAMBOULI
*/

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import edu.webservice.model.Customer;
import edu.webservice.model.Product;

@WebService(name="AmazonManagement", targetNamespace = "http://amazon_management.com/")
public interface AmazonManagement {
	
	@WebMethod(operationName = "logCustomer", action = "urn:log")
	@WebResult
	Boolean logIn(@WebParam(name = "customer") Customer customer);
	
	@WebMethod(operationName = "signCustomer", action = "urn:sign")
	@WebResult
	Boolean signOut();
	
	@WebMethod(operationName = "creatCustomer", action = "urn:creat")
	@WebResult
	Customer createCustomer(@WebParam(name = "customer") Customer customer);
	
	@WebMethod(operationName = "purchaseProduct", action = "urn:purchase")
	@WebResult
	ArrayList<Product> purchase(@WebParam(name = "customer") Customer customer);
	
	@WebMethod(operationName = "addShoppingCart", action = "urn:add")
	@WebResult
	ArrayList<Product> addShoppingCart(@WebParam(name = "product") Product product);
	
	@WebMethod(operationName = "deleteShoppingCart", action = "urn:delete")
	@WebResult
	ArrayList<Product> deleteShoppingCart(@WebParam(name = "product") Product product);
}
