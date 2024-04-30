package Package1;

import java.util.Scanner;

public class Remove1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = s.nextLine();
		int count = 0;
		char ch[] = s1.toCharArray();
		for(int i=0; i<s1.length()-1; i++) {
			for(int j=i+1; j<s1.length(); j++)
			if(ch[i] == ch[j]) {
				ch[j] = ' ';
				ch[i] = ' ';
			}
		}
        String s2 = new String(ch).replaceAll(" ", "");
        System.out.println(s2);
	}

}
