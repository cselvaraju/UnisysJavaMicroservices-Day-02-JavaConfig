package com.unisys.day02JavaConfig;

public class Person {
	
	private String name;
	private Address address;
	
	public Person() {
		
	}
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Address is: " + address);
		System.out.println("Person hashcode: " + this.hashCode());
		System.out.println("Address hashcode: " + address.hashCode());
	}
}
