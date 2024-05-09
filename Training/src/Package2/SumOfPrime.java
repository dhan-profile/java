package Package2;

import java.util.Scanner;

public class SumOfPrime extends Thread {
	private int n;
	private int sum;

	public SumOfPrime(int n, int sum) {
		super();
		this.n = n;
		this.sum = 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		System.out.println("Enter the number: ");
		int n1 = s.nextInt();
		SumOfPrime obj1 = new SumOfPrime(n, 0);
		obj1.start();
		SumOfPrime obj2 = new SumOfPrime(n1, 0);
		obj2.start();
	}

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= n; i++) {
				boolean prime = primeNumbers(i);
				if (prime) {
					sum = sum + i;
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					System.out.print(i + " ");
				}
			}
			System.out.println();
			System.out.println("Sum of prime numbers: " + sum);
		}
	}

	private boolean primeNumbers(int n) {
		int i = 2;
		if(n == 0 || n == 1) {
			return false;
		}
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
