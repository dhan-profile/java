import java.util.Scanner;
import java.lang.Math;

public class ReverseInteger {
    public static int[] digitize(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            // Casting a char to int returns its ASCII value.
            // The ASCII value for '0' is 48,
            // so subtracting 48 from it will convert it into its proper int value.
            array[i] = (int) (s.charAt(length - i - 1)) - 48;
        }
        return array;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a long number: ");
		long val = sc.nextLong();
        int[] arr = digitize(val);
		System.out.print("Reversed number in array form: ");
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
    }
}
