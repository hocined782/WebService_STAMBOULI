package edu.webservice.service;

/**
* @authors DJEBRI & STAMBOULI
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.jws.WebService;

import edu.webservice.model.Customer;
import edu.webservice.model.Product;


@WebService(targetNamespace = "http://amazon_management.com/",
endpointInterface = "edu.webservice.service.AmazonManagement",
portName = "AmazonPort",
serviceName = "AmazonService")
public class AmazonManagementImpl implements AmazonManagement{

	private static Boolean isConnected = false;
	private int id;
	private int totalPrice;
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public Boolean logIn(Customer customer) {
		if(isConnected == false) {
			for(Iterator<Customer> it = customers.iterator(); it.hasNext();) {
				Customer c = it.next();
				if(customer.getName() == c.getName() && customer.getPassword() == c.getPassword()) {
					isConnected = true;
					System.out.println("You are connected");
				}
			}
		}
		return isConnected;
	}
	
	@Override
	public Boolean signOut() {
		if(isConnected == true) {
			products.clear();
			isConnected = false;
		}
		return isConnected;
	}
	
	
	public void register() {
		Random random = new Random();
		id = random.nextInt(100);
		if(isConnected == false) {
			for(Iterator<Customer> it = customers.iterator(); it.hasNext();) {
				Customer c = it.next();
				if(id == c.getId()) {
					System.err.println("You are already exist");
				}
				else {
					System.out.println("User create");
				}
			}
		}
	}
	
	@Override
	public Customer createCustomer(Customer customer) {
		register();
		customers.add(customer);
		customer.setId(id);
		return customer;
	}
	
	
	public int price() {
		for(Iterator<Product> it = products.iterator(); it.hasNext();) {
			Product p = it.next();
			totalPrice += p.getPrice();
		}	
		return totalPrice;
	}
	
	@Override
	public ArrayList<Product> purchase(Customer customer) {
		if(isConnected == true) {
			if(customer.getMoney() >= price()) {
				customer.setMoney(customer.getMoney()-price());
				products.clear();
			}
		}
		return products;
	}
	
	@Override
	public ArrayList<Product> addShoppingCart(Product product) {
		if(isConnected == true) {
			products.add(product);
		}
		return products;
	}
	
	@Override
	public ArrayList<Product> deleteShoppingCart(Product product) {
		if(isConnected == true) {
			products.remove(product);
		}
		return products;
	}
}
