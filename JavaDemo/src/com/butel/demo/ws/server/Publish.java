package com.butel.demo.ws.server;

import javax.xml.ws.Endpoint;

import com.butel.demo.ws.server.impl.HelloServiceImpl;

public class Publish {
	
		public static void main(String []args) {
			Object implementor=new HelloServiceImpl();
			Endpoint.publish("http://localhost:8080/hello", implementor);
			System.out.println("服务发布成功！");
		}
		
}
