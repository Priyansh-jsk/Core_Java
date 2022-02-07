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

	public String toString() {
		return "Address City=" + City + ",State=" + State + pinCode + pinCode + "Country=" + country;
	}
}
