package com.butel.demo.ws.server.impl;

import javax.jws.WebService;

import com.butel.demo.ws.server.IHelloService;

@WebService(endpointInterface="com.butel.demo.ws.server.IHelloService"
		,serviceName="helloService",portName="helloServicePort",targetNamespace="http://lijun.org" )
public class HelloServiceImpl implements IHelloService{
	@Override
	public String hello() {
		return null;
	}

	@Override
	public String hi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sayHi(String name, int age) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
