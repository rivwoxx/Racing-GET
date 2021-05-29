package com.rivwox.racing.controller;

public class ServiceResponse {
	private Object data;
	
	private String message;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMesaje(String message) {
		this.message = message;
	}
}