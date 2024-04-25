package Package1;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = s.nextLine();
		s1 = s1.toLowerCase();
		int vowels = 0, consonants = 0, whitespace = 0, numbers = 0, specialchar = 0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				vowels++;
			} else 	if(s1.charAt(i)>='a' && s1.charAt(i)<='z' || s1.charAt(i)>='A' && s1.charAt(i)<='Z' && s1.charAt(i) != 'a' && s1.charAt(i) != 'e' && s1.charAt(i) != 'i' && s1.charAt(i) != 'o' && s1.charAt(i) != 'u') {
				consonants++;
			} else if(s1.charAt(i) == ' ') {
				whitespace++;
			} else if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				numbers++;
			} else {
				specialchar++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("White space: " + whitespace);
		System.out.println("Numbers: " + numbers);
		System.out.println("Special characters: " + specialchar);
		}

	}

