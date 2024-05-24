package Package2;

interface Ample{
	int a = 0;
}


class Base{
	int n1 = 50;
	int n2 = 50;

	void sum(int n1, int n2) {
		System.out.println("Base Sum: " + (n1+n2));
	}
	
	private void change() {
		System.out.println("Parent change");
	}
	
	static void change2() {
		System.out.println("Parent change2");
	}
}

class Derived extends Base{
	int n1 = 10, n2 = 20; 
	void sum(int n1, int n2) {
		System.out.println("Derived Sum(super) : " + (super.n1+super.n2));
		System.out.println("Derived sum(this) : " + (this.n1+this.n2));
		change();
	}
	
	private void change() {
		System.out.println("child change");
	}
	
	static void change2() {
		System.out.println("Child change2");
	}
}

public class Example1 {

	private int n1 = 5;
	private int n2 = 10;
	
	public Example1() {
		display();
	}
	public Example1(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	void display() {
		System.out.println(n1);
		System.out.println(n2);
		Base b = new Base();
		b.sum(n1, n2);
		Derived d = new Derived();
		d.sum(n1, n2);
		d.change2();
	}
	
	public static void main(String[] args) {
		Example1 e = new Example1();
		Example1 e1 = new Example1(1, 2);
		e1.display();
	}
}
