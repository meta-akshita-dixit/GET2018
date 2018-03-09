/**
 * ConvertToCelsiusServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube;

public class ConvertToCelsiusServiceLocator extends org.apache.axis.client.Service implements com.metacube.ConvertToCelsiusService {

    public ConvertToCelsiusServiceLocator() {
    }


    public ConvertToCelsiusServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConvertToCelsiusServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConvertToCelsius
    private java.lang.String ConvertToCelsius_address = "http://localhost:8080/WebServiceSoap/services/ConvertToCelsius";

    public java.lang.String getConvertToCelsiusAddress() {
        return ConvertToCelsius_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConvertToCelsiusWSDDServiceName = "ConvertToCelsius";

    public java.lang.String getConvertToCelsiusWSDDServiceName() {
        return ConvertToCelsiusWSDDServiceName;
    }

    public void setConvertToCelsiusWSDDServiceName(java.lang.String name) {
        ConvertToCelsiusWSDDServiceName = name;
    }

    public com.metacube.ConvertToCelsius getConvertToCelsius() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConvertToCelsius_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConvertToCelsius(endpoint);
    }

    public com.metacube.ConvertToCelsius getConvertToCelsius(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.metacube.ConvertToCelsiusSoapBindingStub _stub = new com.metacube.ConvertToCelsiusSoapBindingStub(portAddress, this);
            _stub.setPortName(getConvertToCelsiusWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConvertToCelsiusEndpointAddress(java.lang.String address) {
        ConvertToCelsius_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.metacube.ConvertToCelsius.class.isAssignableFrom(serviceEndpointInterface)) {
                com.metacube.ConvertToCelsiusSoapBindingStub _stub = new com.metacube.ConvertToCelsiusSoapBindingStub(new java.net.URL(ConvertToCelsius_address), this);
                _stub.setPortName(getConvertToCelsiusWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConvertToCelsius".equals(inputPortName)) {
            return getConvertToCelsius();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://metacube.com", "ConvertToCelsiusService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://metacube.com", "ConvertToCelsius"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConvertToCelsius".equals(portName)) {
            setConvertToCelsiusEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
