package com.example.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class CustomerAddress {

	private String city;
	private int pincode;
	private int id;
	
	public String getCity() {
		return city;
	}
	
	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	@XmlElement
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public int getId() {
		return id;
	}
	
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "\n CustomerAddress [City=" + city + ", Pincode=" + pincode
				+ ", Id=" + id + "]";
	}
}