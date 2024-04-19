package Numbers;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word/number: ");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int full = s.length()-1;
		int Mid = s.length()/2;
		boolean res = true;
		for(int i=0; i<Mid; i++) {
            int j = full - i;
            if (ch[i] != ch[j]) {
            	res = false;
              	break;	
            }
		}
		if(res) {
			System.out.println("It is a palindrome");	
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}
