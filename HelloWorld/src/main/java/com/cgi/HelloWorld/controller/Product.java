package com.cgi.HelloWorld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String pName;
	
	@Autowired
	Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void helloProuct() {
		// TODO Auto-generated method stub
		System.out.println("hello product");
		System.out.println("hello order");
		
	}
	
	
	
	
	
	

}
