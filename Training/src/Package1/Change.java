package Package1;
import Package2.Testing;
public class Change {

	private int r = 12;
	protected int n = 34;
	int e = 15;
	public int j = 76;
	
	protected void method1() {
		System.out.println("protected fn, private var: " + r);
	}
	public void method2() {
		System.out.println("public fn, Default var: " + e);
	}
	void method3() {
		System.out.println("default fn, public var: " + j);
	}	
	private void method4() {
		System.out.println("private fn, protected var: " + n);
	}
	public static void main(String[] args) {
		Testing t1 = new Testing();
		Change c1 = new Change();
		System.out.println("Package2: ");
		t1.method();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
	}

}
