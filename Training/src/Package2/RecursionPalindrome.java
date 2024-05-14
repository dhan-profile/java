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
		for(int i=0; i<length/2; i++, length--) {
			if(str.charAt(length-1) != str.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
