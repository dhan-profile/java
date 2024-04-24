package Numbers;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt();
		int i=0, arr[] = new int[n], even = 0, odd = 0;
		System.out.println("Enter the array elements: ");
		while(i<n) {
			arr[i] = s.nextInt();
			i++;
		}
		for(i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of even integers: " + even);
		System.out.println("Number of odd integers: " + odd);
	}

}
