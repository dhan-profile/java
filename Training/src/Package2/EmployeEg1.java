package Package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeEg1 {
	int no;
	String name;
	int phone;
	EmployeEg1(int no, String name, int phone){
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	public String toString() {
		return no+" "+name+" "+phone;
	}
	
	
	public static void main(String[] args) {
		EmployeEg1 obj1 = new EmployeEg1(1, "danush", 6846343);
		EmployeEg1 obj2 = new EmployeEg1(2, "karthi", 2356485);
		EmployeEg1 obj3 = new EmployeEg1(3, "ramesh", 87258245);
		
		ArrayList<EmployeEg1> al = new ArrayList<EmployeEg1>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		for(EmployeEg1 e: al) {
//			System.out.println(e.no +" "+ e.name +" "+ e.phone);
			System.out.println(e);
		}
		System.out.println();
		
//		Collections.sort();
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());	
//		}
	}

}
