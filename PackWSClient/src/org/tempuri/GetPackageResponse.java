
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPackageResult" type="{http://tempuri.org/}Pack"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPackageResult"
})
@XmlRootElement(name = "getPackageResponse")
public class GetPackageResponse {

    @XmlElement(required = true, nillable = true)
    protected Pack getPackageResult;

    /**
     * Gets the value of the getPackageResult property.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getGetPackageResult() {
        return getPackageResult;
    }

    /**
     * Sets the value of the getPackageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setGetPackageResult(Pack value) {
        this.getPackageResult = value;
    }

}
