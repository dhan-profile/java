package CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpno(101);
        e1.setName("Alice");
        e1.setLocation("New York");
        e1.setSalary(75000);

        Employee e2 = new Employee();
        e2.setEmpno(102);
        e2.setName("Bob");
        e2.setLocation("San Francisco");
        e2.setSalary(85000);

        Employee e3 = new Employee();
        e3.setEmpno(103);
        e3.setName("Charlie");
        e3.setLocation("Chicago");
        e3.setSalary(95000);

        // Create a LinkedList to store Employee objects
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Add Employee objects to the LinkedList
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        // Iterating through the LinkedList using an iterator
        System.out.println("Employee details using Iterator:");
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            System.out.println(e.getEmpno() + " " + e.getName() + " " + e.getLocation() + " " + e.getSalary());
        }

        // Removing an Employee object from the LinkedList
        employeeList.remove(e2);

        // Iterating through the LinkedList using for-each loop
        System.out.println("\nEmployee details after removal using for-each loop:");
        for (Employee e : employeeList) {
            System.out.println(e.getEmpno() + " " + e.getName() + " " + e.getLocation() + " " + e.getSalary());
        }

                LinkedList<Integer> list = new LinkedList<>();
                list.push(33);
                list.push(61);
                list.offer(55);
                list.push(72);
                list.push(23);
				System.out.println(list.get(0));
				System.out.println(list.get(2));
				for (Integer i : list) {
					System.out.print(i+" ");
				}
    }
}
