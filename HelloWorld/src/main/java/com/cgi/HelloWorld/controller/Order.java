package com.cgi.HelloWorld.controller;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int oId;
	private String orderCreatedBy;
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getOrderCreatedBy() {
		return orderCreatedBy;
	}
	public void setOrderCreatedBy(String orderCreatedBy) {
		this.orderCreatedBy = orderCreatedBy;
	}
	
	

}
