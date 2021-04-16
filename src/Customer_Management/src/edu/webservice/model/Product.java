package edu.webservice.model;

/**
* @authors DJEBRI & STAMBOULI
*/

public class Product {
	private String name;
	private int price;
	private int nbProduct;
	
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param grade
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return name
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 
	 * @param grade
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * 
	 * @return name
	 */
	public int getNbProduct() {
		return nbProduct;
	}
	/**
	 * 
	 * @param grade
	 */
	public void setNbProduct(int nbProduct) {
		this.nbProduct = nbProduct;
	}

}
