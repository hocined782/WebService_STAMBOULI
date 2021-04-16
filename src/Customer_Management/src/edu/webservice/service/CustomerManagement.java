package edu.webservice.service;

/**
* @authors DJEBRI & STAMBOULI
*/

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import edu.webservice.model.Customer;
import edu.webservice.model.Product;

@WebService(name="CustomerManagement", targetNamespace = "http://customer_management.com/")
public interface CustomerManagement {
	
	@WebMethod(operationName = "addedCustomer", action = "urn:add")
	@WebResult 
	public Customer addCustomer(@WebParam(name = "s") Customer s);
	 
	@WebMethod(operationName = "deleteCustomer", action = "urn:delete")
	@WebResult
	public boolean deleteCustomer(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "getCustomer", action = "urn:get")
	@WebResult
	public Customer getCustomer(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "allCustomer", action = "urn:allCus")
	@WebResult
	public Customer[] getAllCustomer();
	
	@WebMethod(operationName = "addedProduct", action = "urn:addPro")
	@WebResult
	public Product addProduct(@WebParam(name = "product") Product product);
	
	@WebMethod(operationName = "allProduct", action = "urn:allPro")
	@WebResult
	public Product[] getAllProduct();
	
	@WebMethod(operationName = "purchase", action = "urn:pur")
	@WebResult
	public boolean purchase(@WebParam(name = "customer") Customer customer);
	
	@WebMethod(operationName = "addedShoppingCart", action = "urn:addCart")
	@WebResult
	public Product addShoppingCart(@WebParam(name = "customer") Customer customer,@WebParam(name = "produit")  Product product);
	
	@WebMethod(operationName = "deleteShoppingCart", action = "urn:deleteCart")
	@WebResult
	public boolean deleteShoppingCart(@WebParam(name = "customer") Customer customer, @WebParam(name = "product") Product product);
	
	@WebMethod(operationName = "getShoppingCart", action = "urn:getCart")
	@WebResult
	public Product getShoppingCart(@WebParam(name = "customer") Customer customer);
	
	
}
