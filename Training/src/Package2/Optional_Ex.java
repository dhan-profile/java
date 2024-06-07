package Package2;

import java.io.*;
import java.util.*;

public class Optional_Ex {
	public static void main(String args[]) throws Throwable {

// Optional - prevents nullpointer exception
		String s = "hello";
		String s1 = null;
	    if(s1 != null && s != null)
	    System.out.println(s1.concat("hello"));
	    
// empty()
	      Optional<String> op5 = Optional.empty();
	      System.out.println(op5);
	      
//   of() - mandatory give String, does not accept null value
	      Optional<String> op = Optional.of(s); System.out.println(op);
	      
//   ofNullable()
	      Optional<String> op1 = Optional.ofNullable(s); System.out.println(op1);
	      Optional<String> op2 = Optional.ofNullable(s1); System.out.println(op2);

//   isPresent()
	      Optional<String> op3 = Optional.ofNullable(s);
	      System.out.println(op1.isPresent());
	      if(op1.isPresent()){ System.out.println(s.concat(" language")); }
		
		Optional<String> opt4 = Optional.ofNullable(s); // hello
		Optional<String> opt5 = Optional.ofNullable(s1);// null

// orElse() 
// If value is present in container, then the value is return or default value will be provided
		System.out.println(op.orElse("there is null"));
		System.out.println(op1.orElse("there is null"));

// orElseGet() 
// If value is present in container, then the value is return or takes value from the supplier
		System.out.println(op.orElseGet(() -> new
				String("there is null"))); System.out.println(op1.orElseGet(() -> new
						String("there is null")));
				
// orElseThrow() 
// If value is present in container, then the value is return or Exception thrown from the supplier 
		System.out.println(op.orElseThrow(() -> new 
				RuntimeException("there is null")));
		System.out.println(op1.orElseThrow(() -> new
				RuntimeException("there is null")));

// filter
	        System.out.println(op.filter(t->t.contains("l")));
	        System.out.println(op1.filter(t->t.contains("s")));

// ifPresent()
	        op.ifPresent(value -> System.out.println(value.concat(" welcome")));
	       op1.ifPresent(value -> System.out.println(value.concat(" welcome")));
	}
}
