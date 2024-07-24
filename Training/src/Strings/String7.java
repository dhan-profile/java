package Strings;

import java.util.Scanner;

public class String7 {
public static void main(String[] args) {
	
//	7. convert string to integer and integer to string in Java
	
	System.out.println("Enter a String: ");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int n = (int)Integer.valueOf(s);
	System.out.println("Integer: "+n);
	
	System.out.println("Enter an Integer: ");
	int num = sc.nextInt();
	s = num+"";
	System.out.println("String: "+s);
}
}
