package Package2;

import java.util.Scanner;

interface Checker{
	public boolean check(String c);
}
public class CheckInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		Checker ch = s2 -> s2.isEmpty();
		System.out.println(ch.check(s1));
	}

}
