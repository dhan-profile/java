package Strings;

import java.util.Scanner;

public class String4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		4. Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		for (char c : alphabets.toCharArray()) {
			int count = 0;
			for (char ch : str.toLowerCase().toCharArray()) {
				if (ch == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Character " + c + " occurs " + count + " times");
			}
		}
	}
}
