package Package1;

class NewEmployee {

	private int emp_id;
	private String emp_name;
	private int emp_salary;
	
	public int getId() {
		return emp_id;
	}
	public String getName() {
		return emp_name;
	}
	public int getSalary() {
		return emp_salary;
	}
	public void setId(int id) {
		this.emp_id = id;
	}
	public void setName(String name) {
		this.emp_name = name;
	}
	public void setSalary(int salary) {
		this.emp_salary = salary;
	}
}
	
	public class Employee{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewEmployee e = new NewEmployee();
		e.setId(1);
		e.setName("Dhanush");
		e.setSalary(500);
		System.out.println("Employee name: " + e.getName());
		System.out.println("Employee id: " + e.getId());
		System.out.println("Employee salary: " + e.getSalary());
	}

}
	
