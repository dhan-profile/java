package Package1;
import java.util.Scanner;

public class NumberOfAlphabets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] count1 = new int[26]; 
        int[] count2 = new int[26]; 
        System.out.println("Enter a string: ");
        String s1 = s.nextLine();
		char a = 97, A = 65;
        for(int i = 0; i < s1.length(); i++) {
			a = 97; A = 65;
            if((s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') || (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')) {
				for(int j=0; j<26; j++){
					if(s1.charAt(i) == a){
					count1[j]++;
				}
					if(s1.charAt(i) == A){
					count2[j]++;
				}
				a++; A++;
				}
            }
        }
		
		a = 97; A = 65;
        for(int i = 0; i < 26; i++) {
			System.out.print(a + ": ");
			System.out.print(count1[i] + " ");
			a++;
        }
		System.out.println();
		for(int i = 0; i < 26; i++) {
			System.out.print(A + ": ");
			System.out.print(count2[i] + " ");
			A++;
        }
    }
}
