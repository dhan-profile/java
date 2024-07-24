package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class String10 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		10. Write a Java program to check whether two strings are anagram or not?
		
		System.out.println("Enter 2 strings: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not Anagram");
			System.exit(0);
		}
		char[] ch1= s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2= s2.toCharArray();
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are not Anagram");
		}
	}

}
