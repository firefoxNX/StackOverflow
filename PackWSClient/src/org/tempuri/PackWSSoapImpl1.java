
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2012-12-22T06:41:01.904-05:00
 * Generated source version: 2.7.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "PackWS",
                      portName = "PackWSSoap12",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "http://10.0.1.32:49232/PackWS.asmx?wsdl",
                      endpointInterface = "org.tempuri.PackWSSoap")
                      
public class PackWSSoapImpl1 implements PackWSSoap {

    private static final Logger LOG = Logger.getLogger(PackWSSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see org.tempuri.PackWSSoap#getPackage(int  id )*
     */
    public org.tempuri.Pack getPackage(int id) { 
        LOG.info("Executing operation getPackage");
        System.out.println(id);
        try {
            org.tempuri.Pack _return = new org.tempuri.Pack();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.PackWSSoap#getName(*
     */
    public java.lang.String getName() { 
        LOG.info("Executing operation getName");
        try {
            java.lang.String _return = "_return-2139576138";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.PackWSSoap#addPackage(org.tempuri.Pack  _package )*
     */
    public void addPackage(org.tempuri.Pack _package) { 
        LOG.info("Executing operation addPackage");
        System.out.println(_package);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
