
package edu.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Thu Apr 16 16:29:26 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "addShoppingCart", namespace = "http://amazon_management.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addShoppingCart", namespace = "http://amazon_management.com/")

public class AddShoppingCart {

    @XmlElement(name = "product")
    private edu.webservice.model.Product product;

    public edu.webservice.model.Product getProduct() {
        return this.product;
    }

    public void setProduct(edu.webservice.model.Product newProduct)  {
        this.product = newProduct;
    }

}

