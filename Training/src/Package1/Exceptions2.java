package Package1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers to divide: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		try {
			FileReader file1 = new FileReader("C:/Users/Public/Documents/example.txt");
			int divide = num1/num2;
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Enter 5 values: ");
			try {
				int[] arr = new int[5];
				for(int i=0; i<=arr.length; i++) {
					arr[i] = s.nextInt();
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			} catch(ArithmeticException e){
				System.out.println(e);
			}
			finally {
				System.out.println("Completed");
			}
		}
	}

}
