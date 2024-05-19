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
	        int[] charCounts = new int[256];

	        for (int i = 0; i < str.length(); i++) {
	            charCounts[str.charAt(i)]++;
	        }

	        char firstNonRepeatedChar = '\0';
	        for (int i = 0; i < str.length(); i++) {
	            if (charCounts[str.charAt(i)] == 1) {
	                firstNonRepeatedChar = str.charAt(i);
	                break;
	            }
	        }

	        char firstRepeatedChar = '\0';
	        for (int i = 0; i < str.length(); i++) {
	            if (charCounts[str.charAt(i)] > 1) {
	                firstRepeatedChar = str.charAt(i);
	                break;
	            }
	        }

	        if (firstNonRepeatedChar != '\0') {
	            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }

	        if (firstRepeatedChar != '\0') {
	            System.out.println("First repeated character: " + firstRepeatedChar);
	        } else {
	            System.out.println("No repeated character found.");
	        }
	}
	
}
	
