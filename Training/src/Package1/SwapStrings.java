package Package1;

import java.util.Scanner;
public class SwapStrings {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = s.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = s.nextLine();

		s1 = s1+" "+s2;
		s2 = s1.replace(s2, "");
		s1 = s1.replace(s2, "");
		
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
	}

}
