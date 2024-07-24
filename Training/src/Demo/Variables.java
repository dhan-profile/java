package Demo;

import java.util.ArrayList;
import java.util.List;

public class Variables {
	int a,b;						// INSTANCE VARIABLE
	static int val1, val2;			//STATIC VARIABLE
	
	 static {
	 System.out.println("Static block");
	 }

	 {
	 System.out.println("Instance block");
	 }

	 public Variables() {
	 System.out.println("Constructor");
	 }
	 
	 public void add() {
		 int n1 = 0;				//LOCAL VARIABLE
	 }

	 public static void main(String[] args) {
//	 MyClass myClass = new MyClass();
//	 MyClass myClass2 = new MyClass();
	 
	 List<String> tools = new ArrayList<>();
	 tools.add("hammer");
	 tools.add("nail");
	 tools.add("hex key");
	 System.out.println(tools.get(0));
	 System.out.println(tools.get(1));
	 }
	}