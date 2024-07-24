package Strings;

import java.util.Scanner;

public class String128 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. input   : welcome to java
//	       output  : wELCOME tO jAVA
		
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].substring(0,1)+str[i].substring(1).toUpperCase() + " ");
		}
		
		System.out.println();
		
//		2.  input   : welcome to java
//	        output  : Welcome To Java
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase() + " ");
		}
		
		System.out.println();
		
//		8.  input   : welcome to java
//	        output  : emoclew ot avaj
			
		for(int i=0; i<str.length; i++) {
			char[] ch = str[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
	}
}
