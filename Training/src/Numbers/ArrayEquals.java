package Numbers;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEquals {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		 int n = s.nextInt(), i=0, arr1[] = new int[n], arr2[] = new int[n];
		 boolean equal= true;
		 System.out.println("Enter the array elements(1): ");
		 while(i<n) {
			 arr1[i] = s.nextInt();
			 i++;
		 }
		 System.out.println("Enter the array elements(2): ");
		 i=0;
		 while(i<n) {
			 arr2[i] = s.nextInt();
			 i++;
		 }
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
	        for (i = 0; i < n; i++) {
	            if (arr1[i] != arr2[i]) {
	                equal = false;
	                break; 
	            }
	        }
		 if(equal) {
			 System.out.println("Array elements are equal");
		 } else {
			 System.out.println("Array elements are not equal");
		 }
	}

}
