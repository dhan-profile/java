package Package2;
import java.util.Scanner;
import java.util.function.*;

public class Functional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the sentence: ");
		String w = sc.nextLine(); 
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
//		check Empty string 
		Predicate<String> p = Predicate.isEqual("");
		System.out.println("NULL string: "+p.test(input));
		
//		count words in sentence
		String[] st = w.split(" ");
		Function<Integer, Integer> count = wc -> wc; 
		System.out.println("Word count: "+count.apply(st.length));
		
//		Upper case and Lower case
		Consumer<String> c = s -> System.out.println(s.toUpperCase()+" "+s.toLowerCase());
		c.accept(input);
		
//		concatenate strings
		Function<String, String> c1 = s1 -> s1 +" "+ "Java"; 
		System.out.println(c1.apply("Programming"));
		
//		odd or even
		Predicate<Integer> val1 = num -> num%2 == 0;
		System.out.println("Even: " + val1.test(n));
		
//		palindrome check
		String rev = new StringBuilder(input).reverse().toString();
		Predicate<String> check = Predicate.isEqual(rev);
		System.out.println("Palindrome: "+check.test(input));
		
//		Sum of 2 numbers
		Function<Integer, Integer> add = num1 -> num1+20;
		System.out.println("Sum: "+add.apply(n));
		
//		check for perfect square
		Predicate<Integer> square = sq -> {
			int sq2 = (int)Math.sqrt(sq);
			return sq2 * sq2 == sq;
		};
		System.out.println("perfect square: "+square.test(n));
		
	}
}
