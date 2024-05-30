package Package2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int no;
	String name;
	
	Employee(int n, String n1){
		this.no = n;
		this.name=n1;
	}
}

public class SerializeExample1 {

	public static void main(String[] args) {
		try {
		Employee obj1 = new Employee(1, "dhanush");
		FileOutputStream obj = new FileOutputStream("C:/Public/f1.xlsx");
		ObjectOutputStream out = new ObjectOutputStream(obj);
		out.writeObject(obj1);
		// Converting object to byte stream
		out.flush();
		out.close();
		System.out.println("Successful");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
