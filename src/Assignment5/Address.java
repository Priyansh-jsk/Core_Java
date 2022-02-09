package Assignment5;

import java.io.Serializable;
import java.util.*;

public class Address implements Serializable {      // properties of Address class declared as private
	private String city;
	private String state;
	private int pinCode;
	private String country;

	public Address(String city, String state, int pinCode, String country) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}

	public String toString() {
		return "Address City=" + city + ",State=" + state + pinCode + pinCode + "Country=" + country;
	}
}
