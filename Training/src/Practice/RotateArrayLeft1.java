package Practice;

import java.util.Arrays;

public class RotateArrayLeft1 {

	public static void main(String[] args) {
		int n = 7;	int arr[] = {-1, -2, -3, 4, 5, 6, 7}; int d = 2;
		d = d % n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
	}

	private static void reverse(int[] arr, int left, int right) {
		while(left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
