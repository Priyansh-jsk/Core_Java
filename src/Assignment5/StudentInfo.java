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

	// Here we will call toString method
	public String toString() {
		return " Student firstName= " + firstName + ", Student dOB= " + dOB + ", Address= " + address ;
	}
}
