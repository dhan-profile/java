package Numbers;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt(), arr[] = new int[n], i=0;
		System.out.println("Enter the array elements: ");
		while(i<n) {
			arr[i] = s.nextInt();
			i++;
		}
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
            }
        }
			System.out.println("Second largest element: " + arr[n-2]);	
	}
}
