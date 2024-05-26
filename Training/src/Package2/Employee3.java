package Package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeNew implements Comparable<EmployeeNew>{
	int no;
	String name;
	int phone;
	EmployeeNew(int no, String name, int phone){
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	// Comparable uses compareTo() method
	public int compareTo(EmployeeNew e) {
		if(this.no == e.no) {
			return 0;
		} else if(this.no > e.no) {
			return 1;
		} else 
			return -1;
//	}
//		return Integer.compare(this.no, e.no);
	}
}

// Comparator uses compare() method
class NameComparator implements Comparator<EmployeeNew>{
	public int compare(EmployeeNew o1, EmployeeNew o2) {
		return o1.name.compareTo(o2.name);
	}
}

class PhoneComparator implements Comparator<EmployeeNew>{
	public int compare(EmployeeNew o1, EmployeeNew o2) {
		return Integer.compare(o1.phone, o2.phone);
	}
}

public class Employee3{
	
	public static void main(String[] args) {
		EmployeeNew en = new EmployeeNew(21, "ram", 38438432);
		EmployeeNew en1 = new EmployeeNew(42, "nirmal", 1233543);
		EmployeeNew en2 = new EmployeeNew(30, "dhanush", 5234235);
		
		ArrayList<EmployeeNew> arr = new ArrayList<>();
		arr.add(en);
		arr.add(en1);
		arr.add(en2);
		
		System.out.println("Name coparator: ");
		Collections.sort(arr, new NameComparator());
		for(EmployeeNew n : arr) {
			System.out.println(n.no + " "+ n.name + " " + n.phone);
		}
		
		Collections.sort(arr);
		System.out.println("\nComparable, CompareTo: ");
		for(EmployeeNew n : arr) {
			System.out.println(n.no + " " + n.name + " " + n.phone);
		}
		
		System.out.println("\nPhone Comparator : ");
		Collections.sort(arr, new PhoneComparator());
		for(EmployeeNew n : arr) {
			System.out.println(n.no + " " + n.name + " " + n.phone);
		}
		
	}
}
