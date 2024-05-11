package Demo;

import java.util.Scanner;

public class SwitchExpressions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character(U,R,L,D): ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'U' -> System.out.println("UP");
		case 'L' -> System.out.println("LEFT");
		case 'R' -> System.out.println("RIGHT");
		case 'D' -> System.out.println("DOWN");
		}
	}

}
