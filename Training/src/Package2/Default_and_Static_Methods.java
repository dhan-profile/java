package Package2;

@FunctionalInterface
interface Function01{
	int add(int n1, int n2);
	default void numbers() {
		System.out.println("1 2 3 4 5");
	}
	default void numbers22() {
		System.out.println("1 2 3 4 5");
	}
	static void number() {
		System.out.println("50");
	}
	static void number33() {
		System.out.println("50");
	}
}

public class Default_and_Static_Methods {
	
	public static void nearBy(int num1, int num2) {
		System.out.println("Near by class method: "+num1+" "+num2);
	}

	public static void main(String[] args) {
		Function01 f1 = (n1,n2) -> { 
			System.out.println(n1+n2); 
			return n1+n2; 
			};
		f1.add(5, 5);
		
//		✅ Static method called using interface name itself (NO NEED OBJECT REF)
		Function01.number();  
//		✅ Default method called using Object reference 'f1' 
		f1.numbers();
		
		number33();
	}
	
//	static method with same name is given but it won't override the method in interface
	static void number33() {
		System.out.println("80");
	}
}
