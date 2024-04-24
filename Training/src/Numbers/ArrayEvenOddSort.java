package Numbers;

import java.util.Scanner;

public class ArrayEvenOddSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt();
		int i=0, arr[] = new int[n], even = 0, odd = 0;;
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
		int[] evenArr = new int[even], oddArr = new int[odd]; 
		int e = 0, o = 0;
		for(i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				evenArr[e] = arr[i];
				e++;
			} else {
				oddArr[o] = arr[i];
				o++;
			}
		}
		System.out.println("Even Array: ");
		for(int ele1 : evenArr) {
			System.out.print(ele1 + " ");
		}
		System.out.println();
		System.out.println("Odd Array: ");
		for(int ele2 : oddArr) {
			System.out.print(ele2 + " ");
		}
	}
}
