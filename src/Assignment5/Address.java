package Assignment5;

import java.io.Serializable;
import java.util.*;

public class Address implements Serializable {      // properties of Address class declared as private
	private String City;
	private String State;
	private int pinCode;
	private String country;

	public Address(String City, String State, int pinCode, String country) {
		this.City = City;
		this.State = State;
		this.pinCode = pinCode;
		this.country = country;
	}
	
	// Getter and Setter
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public int getpinCode() {
		return pinCode;
	}
	public void setpinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setAddress(String country) {
		this.country = country;
	}

	public String toString() {
		return "Address City=" + City + ",State=" + State + pinCode + pinCode + "Country=" + country;
	}
}
