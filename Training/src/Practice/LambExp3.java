package Practice;

import Package2.StudentInterface;

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

class Functiona implements StudentInterface{
	@Override
	public void rollno() {
		System.out.println("rollno");
	}
	@Override
	public void name() {
		
	}
	@Override
	public void subject() {
		
	}
	@Override
	public void grade() {
		
	}
}

public class LambExp3 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> a + b;
		System.out.println(ad1.add(10, 20));
		
		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a * b);
		System.out.println(ad2.add(100, 200));
		
		Functiona fn = new Functiona();
		fn.rollno();
	}
}
