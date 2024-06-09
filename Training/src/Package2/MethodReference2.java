package Package2;
import Package2.Method1;

@FunctionalInterface
interface Add{
	void sum(int n1, int n2);
}
class Details{
	Details(int a1, int a2){
		System.out.println("Constructor !! "+a1+" "+a2);
	}
	
//	No.of.arguments in interface method should match with class method used for method reference
	static void user(int n1, int n2) {
		System.out.println("Name: dhanush");
		System.out.println("RollNo: 101");
	}
}
public class MethodReference2 {
	public static void main(String[] args) {
//		Anonymous function using Lambda expression (for Functional Interface only)
		Add a1 = (n1, n2) -> System.out.println(n1+n2);
		a1.sum(10,20);
		
//		Method Reference syntax: }===> InterfaceObject = className :: method;
		
//		class - static method reference ( Class_Name :: method_name)
		Add a2 = Details :: user;
		a2.sum(5, 10);
		
//		In Java, method references and lambda expressions provide a way to pass around code in a compact and readable manner. 
//		When you create a method reference like Details::user, you are essentially telling the compiler 
//		to treat the user method as an implementation of the sum method in the Add functional interface.

//		constructor - method reference ( Class_Name :: new) 
		Add a3 = Details::new;
		a3.sum(400, 100);
		
//		method reference from different package
		Add a4 = Method1::nearBy;
		a4.sum(70, 950);
	}
}
