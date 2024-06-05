package Package2;

import java.util.Scanner;

@FunctionalInterface
interface Function1 {
	public String Upper(String s);
}

public class FunctionClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		Function1 f1 = c -> { 
			return c.toUpperCase();
		};
		System.out.println(f1.Upper(s1));
	}
}
