package Demo;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	 static {
	 System.out.println("Static block");
	 }

	 {
	 System.out.println("Instance block");
	 }

	 public MyClass() {
	 System.out.println("Constructor");
	 }

	 public static void main(String[] args) {
	 MyClass myClass = new MyClass();
	 MyClass myClass2 = new MyClass();
	 
	 List<String> tools = new ArrayList<>();
	 tools.add("hammer");
	 tools.add("nail");
	 tools.add("hex key");
	 System.out.println(tools.get(0));
	 System.out.println(tools.get(1));
	 }
	}