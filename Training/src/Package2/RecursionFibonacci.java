package Package2;

import java.util.Scanner;

public class RecursionFibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	private static int fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
