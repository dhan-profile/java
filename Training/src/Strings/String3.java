package Strings;

import java.util.Scanner;

public class String3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//		3.Write a program to remove all consonants from the string "Hello, have a good day".
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
        StringBuffer sb = new StringBuffer(new String(sc.nextLine()));
        
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                } else {
                    sb.deleteCharAt(i);
                    i--; 
                }
            }
        }        
        System.out.println(sb.toString());
	}
}
