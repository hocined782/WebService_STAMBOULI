package edu.webservice.model;


/**
* @authors DJEBRI & STAMBOULI
*/

public class Customer {
	private String name;
	private String firstname;
	private String password;
	private int id;
	private int money;
	
	
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
	 * @return firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * 
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return money
	 */
	public int getMoney() {
		return money;
	}
	/**
	 * 
	 * @param money
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	
}
