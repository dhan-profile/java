package Numbers;
import java.util.Scanner;
public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary String s1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Binary String s2: ");
		String s2 = sc.nextLine();
		String addition = binaryAddition(s1, s2);
		System.out.println("Added Binary String: " + addition);
	}
	
	public static String binaryAddition(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int i = s1.length()-1;
		int j = s2.length()-1;
		int carry = 0;
		while(i>=0 || j>=0) {
			int sum =carry;
			if(i>=0) sum = sum + s1.charAt(i) - '0';
			i--;
			if(j>=0) sum = sum + s2.charAt(j) - '0';
			j--;
			sb.append(sum % 2);
			carry = sum >> 1;   // sum will be either 0, 1, 2 or 3. so 0 & 1 has no issues. For 2 & 3, 2-> 010, 3->011 => right shift by 1 gives '1' on either case.
		}
		if(carry != 0)
			sb.append(carry);
		return sb.toString();
	}

}
