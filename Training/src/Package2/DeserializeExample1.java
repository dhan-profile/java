package Package2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
		FileInputStream fin = new FileInputStream("C:/Public/f1.txt");
			ObjectInputStream obj = new ObjectInputStream(fin);
			while(obj.available() >= 0) {
				Employee emp=(Employee)obj.readObject();
				System.out.println(emp.no +" "+ emp.name);
			}
			obj.close();
			System.out.println("Completed");
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
