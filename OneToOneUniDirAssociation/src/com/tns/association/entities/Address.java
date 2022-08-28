package com.tns.association.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@Column(name="addrid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addrid;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;

	public Address(int addrid, String street, String city, String state, int pincode) {
	
		this.addrid = addrid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		
	}
	public Address()
	{
	}

	public int getAddresssid() {
		return addrid;
	}

	public void setAddresssid(int addrid) {
		this.addrid = addrid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
