package com.metacube;

public class ConvertToCelsiusProxy implements com.metacube.ConvertToCelsius {
  private String _endpoint = null;
  private com.metacube.ConvertToCelsius convertToCelsius = null;
  
  public ConvertToCelsiusProxy() {
    _initConvertToCelsiusProxy();
  }
  
  public ConvertToCelsiusProxy(String endpoint) {
    _endpoint = endpoint;
    _initConvertToCelsiusProxy();
  }
  
  private void _initConvertToCelsiusProxy() {
    try {
      convertToCelsius = (new com.metacube.ConvertToCelsiusServiceLocator()).getConvertToCelsius();
      if (convertToCelsius != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)convertToCelsius)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)convertToCelsius)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (convertToCelsius != null)
      ((javax.xml.rpc.Stub)convertToCelsius)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.ConvertToCelsius getConvertToCelsius() {
    if (convertToCelsius == null)
      _initConvertToCelsiusProxy();
    return convertToCelsius;
  }
  
  public double convertToCelsius(double tempInFahernhiet) throws java.rmi.RemoteException{
    if (convertToCelsius == null)
      _initConvertToCelsiusProxy();
    return convertToCelsius.convertToCelsius(tempInFahernhiet);
  }
  
  
}