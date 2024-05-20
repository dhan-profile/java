package Practice;

import java.util.Scanner;

public class RepeatingCharacter1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.replace(" ","");
//		char[] charArray = str.toCharArray();
		findChar(str);
	}
	    public static void findChar(String str) {
	        int[] charCounts = new int[128];

	        for (int i = 0; i < str.length(); i++) {
	            charCounts[str.charAt(i)]++;
	        }

	        char ch1 = '0';
	        for (int i = 0; i < str.length(); i++) {
	            if (charCounts[str.charAt(i)] == 1) {
	                ch1 = str.charAt(i);
	                break;
	            }
	        }

	        char ch2 = '0';
	        for (int i = 0; i < str.length(); i++) {
	            if (charCounts[str.charAt(i)] > 1) {
	                ch2 = str.charAt(i);
	                break;
	            }
	        }

	        if (ch1 != '\0') {
	            System.out.println("First non-repeated character: " + ch1);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }

	        if (ch2 != '\0') {
	            System.out.println("First repeated character: " + ch2);
	        } else {
	            System.out.println("No repeated character found.");
	        }
	}
	
}
	//https://stackoverflow.com/questions/77601661/what-is-this-countstr-charati
