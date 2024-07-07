package ObjectOrientedPrograms;

class Printer {  
	// Prints text  
	final void print(String text) {  
	System.out.println("Printing text: " + text);  
	}  
	  
	// Prints text multiple times  
	void print(String text, int times) {  
	for (int i = 0; i < times; i++) {  
	System.out.println("Printing text: " + text);  
	}  
	}  
	  
	// Prints an image  
	void print(char image) {  
	System.out.println("Printing image: " + image);  
	}  
	}  
	  
	public class StaticPolymorphism {  
	public static void main(String[] args) {  
	Printer printer = new Printer();  
	printer.print("Hello, World!");  
	printer.print("Hello, World!", 3);  
	printer.print('#');  
	}  
	}
