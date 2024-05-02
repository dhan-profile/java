package Package1;
import java.util.Scanner;

	class OutOfRangeException extends Exception{
		public OutOfRangeException(String s1) {
			super(s1);
		}
	}
	
	public class Exceptions1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = s.nextInt();
			if(number <= 100) {
				System.out.println("Your Entered: " + number);
			} else {
				try {
				throw new OutOfRangeException("Value is greater than 100");
				}
				catch(OutOfRangeException r) {
					System.out.println(r);
				}
			}
	}
}
