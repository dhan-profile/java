package Package2;

import java.util.Scanner;
interface Combine{
	public String values(String s1, String s2, String s3);
}
public class Function2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		Combine c = (c1, c2, c3) -> c1+" "+c2+" "+c3;
		System.out.println(c.values(s1,s2,s3));
	}

}
