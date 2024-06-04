package Package2;

interface Template{
	public void show();
}

abstract class Template2 implements Template{
	public void show() {
		System.out.println("Anonymous class using abstract class");
	}
}

public class Anonymous {
//	Constructor
	Anonymous(){
		
	}
	
	public void display(int n1, String s1) {
		System.out.println("Anonymous Object");
		System.out.println(n1 + " " + s1);
	}
	
	public static void sum(int[] arr) {
		System.out.println("Anonymous Array:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		Anonymous Object (An object without name)
		new Anonymous().display(1, "dhanush");
		
//		Anonymous Array (An Array without name)
		sum(new int[] {1, 2, 3, 4});
		
//		Anonymous class (using Interface)
		Template t = new Template() {
			public void show() {
				System.out.println("Anonymous class using interface");
			}
		};
		t.show();
		
//		Anonymous class (using abstract class)
		Template2 t2 = new Template2(){};
		t2.show();
	}
}
