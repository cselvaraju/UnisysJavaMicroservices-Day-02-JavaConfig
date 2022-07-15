package com.unisys.day02JavaConfig;

public class Manufacturer {
	
	private String name;
	private String city;
	
	
	
	public Manufacturer() {
		super();
	}

	public Manufacturer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Manufacturer [name=" + name + ", city=" + city + "]";
	}
	
	
}
