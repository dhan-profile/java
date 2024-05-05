package Practice;

import java.util.Scanner;

public class DistinctTriples {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int length = s.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter array numbers: ");
		for(int i=0; i<length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the Target value: ");
		int target = s.nextInt();
		
		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		 boolean triplet = triplet(arr, target, length);
		 if(triplet == false)
		 System.out.println("Triplet not found");
	}

	private static boolean triplet(int[] arr, int target, int length) {
		for(int x=0; x<length-2; x++) {
			for(int y=x+1; y<length-1; y++) {
				for(int z=y+1; z<length; z++) {
					if(arr[x] + arr[y] + arr[z] == target) {
						System.out.println("Triplet found: ");
						System.out.println(arr[x] + " " + arr[y] + " " + arr[z]);
						return true;
					}
				}
			}
		}
		return false;
	}

}
