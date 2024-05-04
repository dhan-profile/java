package Practice;

import java.util.Scanner;

class OddNumberException extends Exception{
	OddNumberException(String s1){
		super(s1);
	}
}

public class Exception4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		odd(n);
	}

	private static void odd(int n) {
		try {
			if(!(n % 2 == 0)) {
				throw new OddNumberException("Number is odd");
			} else {
				System.out.println("Number is even");
			}
		} catch(OddNumberException odd) {
			System.out.println(odd);
		}
	}

}
