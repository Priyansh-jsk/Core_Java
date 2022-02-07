package Assignment3;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

class EmployeeDemo implements Serializable {
	int empId;
	String empName;
	String empEmail;
	int empAge;
	String empDob;

	EmployeeDemo(int empId, String empName, String empEmail, int empAge, String empDob) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAge = empAge;
		this.empDob = empDob;
	}

	public String toString() {
		return empId + " " + empName + " " + empEmail + " " + empAge + " " + empDob;
	}
}

class Employee {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		File file = new File("employee.txt");
		ArrayList<EmployeeDemo> a1 = new ArrayList<EmployeeDemo>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator<EmployeeDemo> li = null;

		if (file.isFile()) {
			ois = new ObjectInputStream(new FileInputStream(file));
			a1 = (ArrayList<EmployeeDemo>) ois.readObject();
			ois.close();
		}
		do {
			System.out.println("1. Add the details of Employee ");
			System.out.println("2. Display Employee Data ");
			System.out.println("3. Search Employee Data ");
			System.out.println("4. Delete Employee Data ");
			System.out.println("5. Update Employee Data");
			System.out.println("6. Sort by EmployeeId Data");
			System.out.println("7. Sort by EmployeeId in File");
			System.out.println("0. Exit ");
			System.out.println("Enter your Choice how many Employee you want to give: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:                                                         //Add the details of Employee
				System.out.println("Enter how many employee you want: ");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("Enter the Employee ID: ");
					int empId = sc.nextInt();

					System.out.print("Enter the Employee Name: ");
					String empname = sc1.nextLine();

					System.out.print("Enter the Employee email: ");
					String empEmail = sc1.nextLine();

					System.out.print("Enter the Employee Age: ");
					int empAge = sc.nextInt();

					System.out.print("Enter the Employee DOB: ");
					String empDob = sc1.nextLine();

					a1.add(new EmployeeDemo(empId, empname, empEmail, empAge, empDob));
				}
				oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(a1);
				oos.close();
				break;
			case 2:                                                        //Display Employee Data
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();
					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext())
						System.out.println(li.next());
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
			case 3:                                                        //Search Employee Data
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();

					boolean found = false;
					System.out.println("Enter empid to Search: ");
					int empId = sc.nextInt();
					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext()) {
						EmployeeDemo ed = (EmployeeDemo) li.next();
						if (ed.empId == empId) {
							System.out.println(ed);
							found = true;
						}
					}
					if (!found)
						System.out.println("Please enter Vaid Record..!!");
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
			case 4:  													//Delete Employee Data
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();

					boolean found = false;
					System.out.print("Enter empid to Delete: ");
					int empId = sc.nextInt();
					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext()) {
						EmployeeDemo ed = (EmployeeDemo) li.next();
						if (ed.empId == empId) {
							li.remove();
							found = true;
						}
					}
					if (found) {
						oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(a1);
						oos.close();
						System.out.println("Record deleted sucessfully..!!");
					} else {			
						System.out.println("Please enter Vaid Record..!!");
					}
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
			case 5:  												 	//Update Employee Data
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();

					Collections.sort(a1, new Comparator<EmployeeDemo>() {
						public int compare(EmployeeDemo e1, EmployeeDemo e2) {
							return e1.empId - e2.empId;
						}
					});
					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext())
						System.out.println(li.next());
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
			case 6:  													//Sort by EmployeeId Data
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();

					Collections.sort(a1, new Comparator<EmployeeDemo>() {
						public int compare(EmployeeDemo e1, EmployeeDemo e2) {
							return e1.empId - e2.empId;
						}
					});

					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext())
						System.out.println(li.next());
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
			case 7:  													//Sort by EmployeeId File
				if (file.isFile()) {
					ois = new ObjectInputStream(new FileInputStream(file));
					a1 = (ArrayList<EmployeeDemo>) ois.readObject();
					ois.close();

					Collections.sort(a1, new Comparator<EmployeeDemo>() {
						public int compare(EmployeeDemo e1, EmployeeDemo e2) {
							return e1.empId - e2.empId;
						}
					});

					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(a1);
					oos.close();

					System.out.println("------------------------------");
					li = a1.listIterator();
					while (li.hasNext())
						System.out.println(li.next());
					System.out.println("------------------------------");
				} else {
					System.out.println("File is not there..!!");
				}
				break;
				      //Sort by EmployeeId in File
			}
		} while (choice != 0);
	}
}