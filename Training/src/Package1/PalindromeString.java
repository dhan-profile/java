package Package1;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1 = s.nextLine();
		int len = s1.length();
		char[] c1 = new char[len];

		for(int i=0; i<len; i++){
			c1[len-i-1] = s1.charAt(i);
		}
		String s2 = String.valueOf(c1);
		System.out.println(s2);

		if(s1.equalsIgnoreCase(s2)){
			System.out.print("PALINDROME");
		} else {
			System.out.print("NOT A PALINDROME");
		}
	}

}
