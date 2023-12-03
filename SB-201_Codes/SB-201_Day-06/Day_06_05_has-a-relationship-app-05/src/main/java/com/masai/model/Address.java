package com.masai.model;

import java.util.Objects;

public class Address {

	private String city;

	private String state;

	private String pinCode;
	
	private String type;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, String pinCode, String type) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.type = type;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, pinCode, state, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pinCode, other.pinCode)
				&& Objects.equals(state, other.state) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", type=" + type + "]";
	}

}
