
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

@XmlRootElement(name = "creatCustomer", namespace = "http://amazon_management.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creatCustomer", namespace = "http://amazon_management.com/")

public class CreatCustomer {

    @XmlElement(name = "customer")
    private edu.webservice.model.Customer customer;

    public edu.webservice.model.Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(edu.webservice.model.Customer newCustomer)  {
        this.customer = newCustomer;
    }

}

