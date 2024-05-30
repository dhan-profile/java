package Demo;

class SubClass implements InterfaceEg1{
	public static void mn(){
		System.out.println(v);
	}
}

public class Mystery {

	private static final String message = "Hello";

	public static void main(String[] args) {
		System.out.println(message);
		SubClass sub = new SubClass();
		sub.mn();  
	}
	static {
//		 message = "World";
	}
}
