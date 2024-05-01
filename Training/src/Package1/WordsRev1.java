package Package1;

import java.util.Scanner;

public class WordsRev1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = s.nextLine();
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(reverse(s2[i]) + " ");
		}
	}

	static String reverse(String arr) {
		char[] ch = arr.toCharArray();
		int length = ch.length - 1;
		String str = "";
		while (length >= 0) {
			str = str + ch[length];
			length--;
		}
		return str;
	}

}
