package Practice;

public class MethodOverriding {

	public void ss() {
		int a=22;
		System.out.println("I am employee");
	}
	class Student extends MethodOverriding{
		int a = 25;
		public void ee() {
			System.out.println(a);
		}
		public void ss() {
			System.out.println("I am not an employee. I'm student");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m1 = new MethodOverriding();
		Student s1 = m1.new Student();
		m1.ss();
		s1.ee();
		s1.ss();
	}

}
