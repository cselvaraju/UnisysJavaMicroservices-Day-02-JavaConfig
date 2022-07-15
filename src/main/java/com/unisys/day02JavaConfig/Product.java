package com.unisys.day02JavaConfig;

public class Product {

	private String name;
	private Float price;
	private Manufacturer manufacturer;

	public Product() {
		super();
	}

	public Product(String name, Float price, Manufacturer manufacturer) {
		super();
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", manufacturer=" + manufacturer + "]";
	}

}
