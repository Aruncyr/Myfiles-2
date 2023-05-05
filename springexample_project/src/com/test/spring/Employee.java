package com.test.spring;

public class Employee {
	private int id;
	private String name;
	private Address address;// Aggregation

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {
		System.out.println("def cons");
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString()); // ci dependent object example
												// line
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

}
