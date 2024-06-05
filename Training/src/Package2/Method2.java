package Package2;

@FunctionalInterface
interface Add{
	void sum(int n1, int n2);
}
class Details{
	static void user(int n1, int n2) {
		System.out.println("Name: dhanush");
		System.out.println("RollNo: 101");
	}
}
public class Method2 {
	public static void main(String[] args) {
		Add a1 = (n1, n2) -> System.out.println(n1+n2);		
		Add a2 = Details :: user;
		a1.sum(10,20);
		a2.sum(5, 10);
		
//		In Java, method references and lambda expressions provide a way to pass around code in a compact and readable manner. 
//		When you create a method reference like Details::user, you are essentially telling the compiler 
//		to treat the user method as an implementation of the sum method in the Add functional interface.

	}
}
