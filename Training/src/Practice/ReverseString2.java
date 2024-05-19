package Practice;

import java.util.Scanner;

public class ReverseString2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] stringArray = str.split(" ");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		str = str.replace(" ","");
		char[] charArray = str.toCharArray();
		int strIndex = 0;
		for (int charIndex = 0; charIndex <charArray.length ; strIndex++) {
			for(int j = 0; j<stringArray[strIndex].length() ; j++,charIndex++) {
				System.out.print(charArray[charIndex]);
			}
			System.out.print(" ");
		}
	}

}
