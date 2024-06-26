package Practice;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(1, "java");
		System.out.println(sb);
		
		sb.replace(1, 3, "NEW");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		sb1.append("Hello");
		System.out.println(sb1.capacity());
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(10);
		System.out.println(sb1.capacity());
		
		sb1.ensureCapacity(50);
		System.out.println(sb1.capacity());
	}
}