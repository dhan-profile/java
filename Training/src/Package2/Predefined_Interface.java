package Package2;
import java.util.function.*;
public class Predefined_Interface {
//===============================================================
//Function Interface - take a single input and produce return value.
//===============================================================
//apply()- input
//andThen() - first obj input and passed into the sec obj
//compose() - 
//identity() - duplicate value
	
//===============================================================
//Predicate Interface - take a single input and give their boolean output.
//===============================================================
//test()- input
//and() - both cond satified
//or() - either one cond satify
//negate() - inverse 
//isEqual() - compare
	
//===============================================================
//Supplier Interface - no input and only returns values
//===============================================================
//Type get()
	
//===============================================================
//Consumer Interface - take a single input and give their type output(void).
//===============================================================
//accept()- input
//andThen()- same input
	
//------------------------------------------------------------------------------
//Bi-Predicate - take 2 input and give their boolean output.
//Bi-Consumer - take 2 input and give their result.
//Bi-Function - take 2 input and give their type output.
//Bi-Supplier- doesnt have any inputs and outputs
	public static void main(String[] args) {
		Supplier<Integer> sp = () -> (int)Math.sqrt(64);
		System.out.println(sp.get());	
		
		Predicate<Integer> num = n -> n<10;
		System.out.println(num.test(4));
		
		Consumer<Integer> consumer = c -> System.out.println(c);
		consumer.accept(50);
		
		Function<String, Integer> function = f -> Integer.parseInt(f);
		System.out.println(function.apply("123"));
		
		Function<Integer, Integer> combined = c1 -> c1+c1;
		Function<Integer, Integer> combined2 = c2 -> c2*c2;
		System.out.println(combined2.andThen(combined).apply(10));
		System.out.println(combined2.compose(combined).apply(10));
		
		Function<Integer, Integer> clone = Function.identity();
		System.out.println(clone.apply(4));
		System.out.println(combined2.apply(4));
	}
}