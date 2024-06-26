package Practice;
import java.util.Arrays;
public class StringManipulation {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s4 = "  Java Programming    ";
		String s7 = "Hello, have a great day";
		
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		
		s3 = s1.substring(3);
		System.out.println(s3);
		
		int n1 = s1.length();
		System.out.println(n1);
		
		s3 = s4.trim();
		System.out.println(s3);
		
		String[] s5 = s7.split(" ");
		System.out.println(s5[0] + s5[3] + s5[4]);
		
		s3 = s2.replace('o', 'a');
		System.out.println(s3);
		
		s3 = s2.toUpperCase();
		System.out.println(s3);
		
		n1 = s7.indexOf("great");
		System.out.println("g: " + n1);
		
		char[] ch = {'a', 'e', 'i', 'o', 'u'};
		String s8 = new String(ch);
		System.out.println(s8);
		
		String s9 = "Programming";
		String s10 = "grm";
		System.out.println(s9.contains(s10));
		s10 = "gram";
		System.out.println(s9.contains(s10));
		
		String text = new String("Hello, My name is Sachin");
		String[] s = text.split(" ", 4);
		System.out.println(Arrays.toString(s));
	}

}
