package Strings;

import java.util.Arrays;

public class AllStringMethods {

	public static void main(String[] args) {
		String s = "Hello Java Programming"; char[] ch = s.toCharArray(); byte n = 10;
		String s1 = "Welcome", s2 = "JAVA", s3 = "Java", s4="", s5="   ";
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(2));
		System.out.println(s.codePointBefore(2));
		System.out.println(s.codePointCount(4, 12));
		System.out.println((int)'A' + " to " + (int)'Z');
		System.out.println((int)'a' + " to " + (int)'z');
		System.out.println(s.compareTo(s1));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s1.concat(s2));
		System.out.println(s.contains(s3));
		System.out.println(s2.contentEquals(s3)); System.out.println("CHAR: ");
		s.chars().mapToObj(c -> (char) c).forEach(System.out::print);
		System.out.println(s.endsWith("ing"));
		System.out.println(s2.equals("JAVA")); System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.getBytes());
		System.out.println(s2.hashCode());
		System.out.println(s3.indexOf('a'));
		System.out.println(s5.isEmpty()); System.out.println(s4.isBlank());
		System.out.println(s5.isBlank()); System.out.println(s4.isEmpty());
		System.out.println(s.length());
		System.out.println(s2.toLowerCase()); System.out.println(s3.toUpperCase());
		System.out.println(s.substring(4)); System.out.println(s.substring(4, 15));
		System.out.println(String.valueOf(n)); System.out.println(n+"");
		
	}

}
