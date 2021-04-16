package edu.webservice.model;

import java.util.ArrayList;

/**
* @authors DJEBRI & STAMBOULI
*/

public class Customer {
	private String name;
	private String firstname;
	private String password;
	private int id;
	private int money;
	private ArrayList<Product> shoppingCart;

	
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return name
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * 
	 * @param name
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * 
	 * @return name
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param name
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return name
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param name
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return name
	 */
	public int getMoney() {
		return money;
	}
	/**
	 * 
	 * @param name
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	/**
	 * 
	 * @return name
	 */
	public ArrayList<Product> getShoppingCart() {
		return shoppingCart;
	}
	/**
	 * 
	 * @param name
	 */
	public void setShoppingCart(ArrayList<Product> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}


}
