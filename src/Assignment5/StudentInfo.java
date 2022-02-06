package Assignment5;

import java.util.*;
import java.io.Serializable;

public class StudentInfo implements Serializable {     //define student properties as private
	private String firstName;
	private String dOB;
	private Address address;
	
	public StudentInfo(String firstName, String dOB, Address address) {
		this.firstName = firstName;
		this.dOB = dOB;
		this.address = address;
	}
	
	// Getter and Setter
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Here we will call toString method
	public String toString() {
		return " Student firstName= " + firstName + ", Student dOB= " + dOB + ", Address= " + address;
	}
}
