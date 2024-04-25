package Package1;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = s.nextLine();
		System.out.println(s1);
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.contains("day"));
	}

}
