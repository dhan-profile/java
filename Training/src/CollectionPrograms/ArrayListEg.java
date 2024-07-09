package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEg {

	public static <E> void main(String[] args) {
		Employee E = new Employee();
        E.setEmpno(101);
        E.setName("aaa");
        E.setLocation("Delhi");
        E.setSalary(50000);
        
		Employee E2 = new Employee();
        E2.setEmpno(102);
        E2.setName("bbb");
        E2.setLocation("Bengaluru");
        E2.setSalary(40000);
         
        try {
        	Employee e3 = (Employee)E2.clone();
        	System.out.println(E2.equals(e3));
            System.out.println("Cloned Employee: " + e3.getEmpno() + " " + e3.getName() + " " + e3.getLocation() + " " + e3.getSalary());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(E);
		arr.add(E2);
//		for (Employee e : arr) {
//			System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getLocation()+" "+e.getSalary());
//		}
		
//		Using ITERATOR interface 
//		Iterator<Employee> itr = arr.listIterator();
		
		for (Iterator<Employee> i = arr.iterator(); i.hasNext(); ) {
			Employee e = (Employee) i.next();
			System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getLocation()+" "+e.getSalary());
		}
		Collections.sort(null);
	}

}
