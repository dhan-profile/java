package Package1;
import java.util.Scanner;
public class VowelsReplace {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String s1 = s.nextLine();
		char[] c1 = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				c1[i] = 'X';
			}
		}
		
		for(char c : c1){
		System.out.print(c);
		}
	}
}
