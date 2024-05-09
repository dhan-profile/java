package Practice;
class Parent{
	void printData() {
		System.out.println("Parent class Method");
	}
}
class Child extends Parent{
	void printData() {
		System.out.println("Child class Method");
	}
}
public class UpcastAndDowncast {
	public static void main(String[] args) {
		Parent p = new Child();
		p.printData();
		Parent p2 = (Parent) new Child();
		p2.printData();
		Child c = (Child) p;
		c.printData();
//		Parent p1 = new Parent();
//		p1.printData();
		
	}

}
