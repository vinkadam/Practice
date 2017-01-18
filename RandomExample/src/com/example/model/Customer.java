package com.example.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private String name;
	private int age;
	private int id;
	private List<CustomerAddress> address;
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	
	public List<CustomerAddress> getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(List<CustomerAddress> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + name + ", Age=" + age + ", Id=" + id
				+ ", Address=" + address + "]";
	}
	

}
