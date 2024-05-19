package Practice;

import java.util.Scanner;

public class ReverseSentence2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] stringArray = str.split(" ");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		for (int i = stringArray.length-1; i >=0 ; i--) {
			System.out.print(stringArray[i] + " ");
		}
	}

}
