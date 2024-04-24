package Numbers;
import java.util.Scanner;
public class ArrayIndex {

	static int findIndex(int find, int[] arr, int n) {
		for(int j=0; j<n; j++) {
			if(find == arr[j]) {
				return j;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt(), find;
		int i=0, arr[] = new int[n];
		System.out.println("Enter the array elements: ");
		while(i<n) {
			arr[i] = s.nextInt();
			i++;
		}
		System.out.println("Enter the number: ");
		find = s.nextInt();
		int loc = findIndex(find, arr, n);
		if(loc > 0) {
			System.out.println("The number is found at index: " + loc);
		} else {
			System.out.println("Not found");
		}

	}

}
