package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class Sort1 implements Runnable{
	int n;
	int[] arr;
	Sort1(int n, int[] arr){
		this.n = n;
		this.arr = arr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		Sort1 s1 = new Sort1(n, arr);
		Thread t1 = new Thread(s1);
		t1.setName("First");
		Thread t2 = new Thread(s1);
		t2.setName("Second");
		Thread t3 = new Thread(s1);
		t3.setName("Third");
		t1.start();
		t2.start();
		t3.start();
	}

	void SortArray(int[] arr, int n) {
		Arrays.sort(arr);
		synchronized (arr) {
		System.out.println(Thread.currentThread());
		System.out.println("Sorted array: ");
		
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}	
		}
		System.out.println();
	}

	public void run() {
		SortArray(arr, n);
	}

}
