package Package2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable{
	int no;
	String name;
	public Employee1(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
}

public class SerializationExample2 {

	public static void main(String[] args) {
		try {
			Employee1 emp1 = new Employee1(101, "dhanush");
			Employee1 emp2 = new Employee1(102, "robin");
			Employee1 emp3 = new Employee1(103, "thomas");
			FileOutputStream fobj =new FileOutputStream("C:/Public/f2.xlsx");
			ObjectOutputStream obj1 = new ObjectOutputStream(fobj);
			obj1.writeObject(emp1);
			obj1.writeObject(emp2);
			obj1.writeObject(emp3);
			obj1.flush();
			obj1.close();
			System.out.println("Completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
