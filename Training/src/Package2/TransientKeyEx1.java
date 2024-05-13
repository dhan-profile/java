package Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientKeyEx1 implements Serializable{

	private int n1 = 1;
	transient int n2= 2;
	
	public static void main(String[] args) {
		try {
			TransientKeyEx1 t1 = new TransientKeyEx1();
			FileOutputStream fout = new FileOutputStream("C:/Public/f2.txt");
			ObjectOutputStream obj1 = new ObjectOutputStream(fout);
			obj1.writeObject(t1);
			
			FileInputStream fin = new FileInputStream("C:/Public/f2.txt");
			ObjectInputStream obj2= new ObjectInputStream(fin);
			TransientKeyEx1 t2 = (TransientKeyEx1)obj2.readObject(); 
			
			System.out.println("n1= "+ t2.n1);
			System.out.println("n2= " + t2.n2);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
