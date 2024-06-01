package Practice;
import java.util.Arrays;
public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		
		StringBuffer sb2 = new StringBuffer("check");
		StringBuffer sb3 = new StringBuffer("check");
		System.out.println(sb2.equals(sb3));
		// false because StringBuffer do not override equals method
		// We have to use sb2.toString().equals(sb3.toString());
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(1, "Java");
		System.out.println(sb);
		
		sb.replace(1, 3, "NEW");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(10);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(50);
		System.out.println(sb1.capacity());
	}
}