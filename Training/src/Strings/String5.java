package Strings;

import java.util.Scanner;

public class String5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		5. write a program to swapping two strings.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings:");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1 = s1+s2;
		s2 = s1.substring(0, s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("String 1: "+s1+ "\n" + "String 2: "+s2);
	}

}
