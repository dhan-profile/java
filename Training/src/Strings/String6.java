package Strings;

import java.util.Scanner;

public class String6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		6. Write a program to find the number of vowels, consonants, digits, special characters 
//		   and white space characters in a string.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = s.nextLine().toLowerCase();
		int[] count = new int[5];

		for(char c : s1.toCharArray()) {
		    if("aeiou".indexOf(c) != -1) count[0]++;
		    else if(Character.isLetter(c)) count[1]++;
		    else if(Character.isWhitespace(c)) count[2]++;
		    else if(Character.isDigit(c)) count[3]++;
		    else count[4]++;
		}

		System.out.println("Vowels: " + count[0]);
		System.out.println("Consonants: " + count[1]);
		System.out.println("White space: " + count[2]);
		System.out.println("Numbers: " + count[3]);
		System.out.println("Special characters: " + count[4]);
	}

}
