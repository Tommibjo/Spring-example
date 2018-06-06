package com.juurivuohi.spring.ordermanagement;

public class Customer {

	private int id;
	private String name;
	private String address;
	private Terms terms;

	public Customer() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTerms(Terms terms) {
		this.terms = terms;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", terms=" + terms + "]";
	}

}
