package Numbers;
import java.util.Scanner;
public class ArrayCommon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = s.nextInt(); 	
		String[] s1 = new String[num], s2 = new String[num];
		System.out.println("Enter string array elements 1: ");
		for(int i=0; i<num; i++) {
			s1[i] = s.next();
		}
		System.out.println("Enter string array elements 2: ");
		for(int i=0; i<num; i++) {
			s2[i] = s.next();
		}
		System.out.println("Common arrays are: ");
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
					break;
				}
			}
		}
	}

}
