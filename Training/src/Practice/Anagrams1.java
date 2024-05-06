package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = s.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = s.nextLine();
//		if(anagram(s1.toLowerCase(), s2.toLowerCase())) {
//			System.out.println("Strings are Anagram");
//		} else {
//			System.out.println("No");
//		}
        char[] sChars = s1.toLowerCase().toCharArray();
        char[] tChars = s2.toLowerCase().toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        if(Arrays.equals(sChars, tChars)) {
        	System.out.println("Strings are Anagrams");
        } else {
        	System.out.println("No");
        }
	}

//	private static boolean anagram(String s1, String s2) {
//		char[] c1 = s1.toCharArray();
//		Arrays.sort(c1);
//		char[] c2 = s2.toCharArray();
//		Arrays.sort(c2);
//		int count = 0;
//		if(c1.length != c2.length) {
//			return false;
//		}
//		for(int i=0; i<c1.length; i++) {
//			for(int j=0; j<c2.length; j++) {
//				if(c1[i] == c2[j]) {
//					count++;
//					break;
//				}
//			}
//		}
//		if(count == c1.length) {
//			return true;
//		}
//		return false;
//	}

}
