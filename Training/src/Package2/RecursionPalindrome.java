package Package2;
import java.util.Scanner;
public class RecursionPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		boolean b = palindrome(str);
		if(b) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	private static boolean palindrome(String str) {
		int length = str.length();
		int i = 0;
		if(length/2 > i) {
			if(str.charAt(length-1) != str.charAt(i))
			return false;
		} else {
			i++; length--;
			palindrome(str);
		}
		return true;
	}
}
