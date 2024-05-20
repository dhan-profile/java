package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Compare1 {

	public static void main(String[] args) {
		Student s = new Student(4, "dhanush", 58);
		Student s1 = new Student(3, "haris", 43);
		Student s2 = new Student(2, "nirmal", 72);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
//		al.toString();
		Collections.sort(al);  
		
//		System.out.println(al);
		for (Student student : al) {
			System.out.println(student);
		}
		
	}

}
