package Assignment5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

//Main Class
class SerializationTest {

    private static final Address address1 = null;

	//Main Driver Method
    public static void main(String[] args) {
    	
    	Address address1 = new Address("Indore ", "M.P ", 452005, "India");
    	StudentInfo student1 = new StudentInfo("Priyansh", "29/05/2000", address1);

    	Address address2 = new Address("Ujjain ", "Madhya pradesh ", 452006, "India");
        StudentInfo student2 = new StudentInfo("Sunil", "05/10/1995", address2);

    	Address address3 = new Address("Bhopal ", "Madhya Pradesh ", 452007, "India");
        StudentInfo student3 = new StudentInfo("Vandana", "01/10/1968", address3);

    	Address address4 = new Address("Kanpur ", "U.P ", 635364, "India");
        StudentInfo student4 = new StudentInfo("Priyank", "29/05/1965", address4);

        List<StudentInfo> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        //Serialization file methods 
        try {
            //Save of object in a list
            FileOutputStream fileOutputStream = new FileOutputStream("output1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //serialization of list
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("List is now serialized.. ");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}