import java.util.*;
public class Add{
public static void main(String[] x){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a binary string s1: ");
	String s1 = sc.nextLine();
	System.out.println("Enter a binary string s2: ");
	String s2 = sc.nextLine();
	binaryAddition(s1,s2);
	//System.out.println("Addition of 2 binary strings : " + add);
}

public static void binaryAddition(String s1, String s2){
	//char[] ch1 = s1.toCharArray();
	int[] n1 = new int[s1.length()];
	int[] n2 = new int[s2.length()];
	System.out.println("Integer array[]: ");
	for(int i=0; i<s1.length(); i++){
		n1[i] = s1.charAt(i) - '0';
	}
	for(int res1 : n1){
		System.out.print(res1);
	}
	System.out.println();
	for(int i=0; i<s2.length(); i++){
		n2[i] = s2.charAt(i) - '0';
	}
	for(int res2 : n2){
		System.out.print(res2);
	}
	//  int[] array to int
	System.out.println();
	int res=0;
    for(int i=0; i<n2.length; i++) {
         res = res*10 + n2[i];
    }
	System.out.println("Integer value: " + res);
	
	System.out.println("Addition of two binary strings: ");
	    // Use as radix 2 because it's binary    
    int number0 = Integer.parseInt(s1, 2);
    int number1 = Integer.parseInt(s2, 2);

    int sum = number0 + number1;
	System.out.println("Integer value of String s1: " + number0);
	System.out.println("Integer value of String s2: " + number1);
    System.out.println(Integer.toBinaryString(sum));
	//int addition = s1 + s2;
	//return addition;
}
}
