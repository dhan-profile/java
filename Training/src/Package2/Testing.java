package Package2;
import Package1.Change;
public class Testing extends Change{

	private int a = 5;
	protected int b = 8;
	int c = 4;
	public int i = 8;
	
	public void method() {
		System.out.println("Private: " + a);
		System.out.println("Protected: " + b);
		System.out.println("Default: " + c);
		System.out.println("Public: " + i);
	}
	
	public static void main(String[] args) {
		Testing t1 = new Testing();
		Change c1 = new Change();
		System.out.println("Package1: ");
		t1.method();
		c1.method2();
		t1.method1();
		int p1 = c1.j;
		//int p2 = c1.n;
		System.out.println("Public int: " + p1);
	}

}
