package Package2;

public class EmployeeObj1 {

	private int Emp_no;
	String name;
	
	EmployeeObj1(int no, String name){
		this.Emp_no = no;
		this.name = name;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		try {
		EmployeeObj1 emp1 = new EmployeeObj1(1, "dhanush");
		EmployeeObj1 emp2 = new EmployeeObj1(2, "dhan");
		EmployeeObj1 emp3 = (EmployeeObj1) emp1.clone(); 
		emp1.getClass();
		emp1.hashCode();
		emp1.toString();
		System.out.println(emp1.Emp_no + " " + emp1.name);
		System.out.println(emp1.getClass());
		System.out.println(emp1.hashCode());
		System.out.println(emp1.toString());
		System.out.println(emp2.equals(emp1));
		//System.out.println(emp3.Emp_no);
		//emp1.finalize();
		}
		catch(CloneNotSupportedException c) {
			System.out.println("Clone Not Supported");
		}
	}

}
