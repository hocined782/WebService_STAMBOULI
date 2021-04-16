package edu.webservice.service;

/**
* @authors DJEBRI & STAMBOULI
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import edu.webservice.model.Customer;
import edu.webservice.model.Product;


@WebService(targetNamespace = "http://customer_management.com/",
endpointInterface = "edu.webservice.service.CustomerManagement",
portName = "CustomerPort",
serviceName = "CustomerService")
public class CustomerManagementIpml implements CustomerManagement {
	
	private Map<Integer,Customer> CUSTOMER_DATA = new HashMap<Integer,Customer>();
	private static Map<Integer,Product> PRODUCT_DATAS = new HashMap<Integer,Product>();

	
	private int getNewId() {
		int newId = 0;
		for (int id : CUSTOMER_DATA.keySet()) {
			if (newId < id)
				newId = id;
		}
		return ++newId;
	}

	@Override
	public Customer addCustomer(Customer s) {
		int id = getNewId();
		if(CUSTOMER_DATA.get(s.getId()) != null) {
			return null;
		}
		s.setId(id);
		CUSTOMER_DATA.put(id, s);
		return s;
	}
 
	@Override
	public boolean deleteCustomer(int id) {
		if(CUSTOMER_DATA.get(id) == null) {
			return false;
		}
		CUSTOMER_DATA.remove(id);
		return true;
	}
 
	@Override
	public Customer getCustomer(int id) {
		return CUSTOMER_DATA.get(id);
	}

	@Override
	public Customer[] getAllCustomer() {
		Set<Integer> ids = CUSTOMER_DATA.keySet();
		Customer[] s = new Customer[ids.size()];
		int i = 0;
		for(Integer id : ids) {
			s[i] = CUSTOMER_DATA.get(id);
			i++;
		}
		return s;
	}
	
/************************************************ Product *****************************************************/ 

	private int getNewNb() {
		int newNb = 0;
		for (int nb : PRODUCT_DATAS.keySet()) {
			if (newNb < nb)
				newNb = nb;
		}
		return ++newNb;
	}
	
	@Override
	public Product addProduct(Product product) {
		int nb = getNewNb();
		if(PRODUCT_DATAS.get(product.getNbProduct()) != null) {
			return null;
		}
		product.setNbProduct(nb);
		PRODUCT_DATAS.put(nb, product);
		return product;
	}
 
	@Override
	public Product[] getAllProduct() {
		Set<Integer> ids = PRODUCT_DATAS.keySet();
		Product[] p = new Product[ids.size()];
		int i = 0;
		for(Integer id : ids) {
			p[i] = PRODUCT_DATAS.get(id);
			i++;
		}
		return p;
	}	
	
	
	

/************************************************ Shopping Cart *****************************************************/ 
	
	@Override
	public boolean purchase(Customer customer) {
		boolean buy=false;
		int totalPrice = 0;
		for(Iterator<Product> it = customer.getShoppingCart().iterator(); it.hasNext();) {
			Product p = it.next();
			totalPrice += p.getPrice();
		}
		if(customer.getMoney() >= totalPrice) {
			customer.setMoney(customer.getMoney()-totalPrice);
			customer.getShoppingCart().clear();
			buy=true;
		}
		else {
			buy=false;
		}
		return buy;
	}
	
	@Override
	public Product addShoppingCart(Customer customer, Product product) {
		customer.getShoppingCart().add(product);
		return product;
	}
	
	@Override
	public boolean deleteShoppingCart(Customer customer, Product product) {
		if(customer.getShoppingCart() == null) {
			return false;
		}
		customer.getShoppingCart().remove(product);
		return true;
	}
	
	@Override
	public Product getShoppingCart(Customer customer) {
		Product product = null;
		for(Iterator<Product> it = customer.getShoppingCart().iterator(); it.hasNext();) {
			Product p = it.next();
			return product = p;
		}
	    return product;
	  }
}
