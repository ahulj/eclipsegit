package com.butel.demo.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IHelloService {
	public String hello();
	
	@WebMethod(exclude=true)
	public String hi();
	
	@WebResult(name="ret")
	@WebMethod(operationName="sayHiAlias")
	public String sayHi(@WebParam(name="nickName")String name,@WebParam(name="age")int age);
}
