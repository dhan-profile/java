import java.io.*;
import java.util.*;

//User function Template for Java

class FullPrime{
	static int fullPrime(int N){
	    List<Integer> l = new ArrayList<>(Arrays.asList(2,3,5,7));
	    for(int i = 2; i<=Math.sqrt(N); i++){
	        if(N%i == 0){
	            return 0;
	        }
	    }
	    while(N != 0 ){
	        if(!l.contains(N%10))
	            return 0;
	        N/=10;
	    }
	    return 1;
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int res = fullPrime(number);
		if(res == 1){
				System.out.println("The given number is FULL Prime");	
		} else {
			System.out.println("The given number is not a Full Prime");	
		}
	}
}