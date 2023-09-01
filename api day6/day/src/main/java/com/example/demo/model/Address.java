package com.example.demo.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addressId;
	private String city;
	private String pincode;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;


	public Address() {
	}


	public Address(long addressId, String city, String pincode) {
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}


	public long getAddressId() {
		return addressId;
	}


	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
