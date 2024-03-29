/*import java.util.*;
class FactorialRecursive{
	//static int n;
	int factorial(int n){
		if(n==0){
			return 1;
		} else {
	return(n*factorial(n-1));
	}}
	public static void main(String args[]){
		//int n;
		FactorialRecursive x = new FactorialRecursive();
		x.n = Integer.parseInt(args[0]);
		System.out.println("Factorial of " + n + " is " + n.factorial(x.n));
	}
} */
/*import java.util.*;

class FactorialRecursive {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide an integer argument.");
            return;
        }

        int inputNumber = Integer.parseInt(args[0]);
        FactorialRecursive x = new FactorialRecursive();
        int result = x.factorial(inputNumber);
        System.out.println("Factorial of " + inputNumber + " is " + result);
    }
}*/
import java.util.*;
class FactorialRecursive {
	protected int factorial(int x){
		if(x==0){
			return 1;
		} else {
			return (x*factorial(x-1));
		}
	}
	public static void main(String args[]){
		FactorialRecursive x = new FactorialRecursive();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = s.nextInt();
		//int userInput = Integer.parseInt(args[0]);
		int calculatedValue = x.factorial(userInput);
		System.out.println("The Factorial of " +  userInput + " is " + calculatedValue);
		//System.out.printf("The Factorial of %d is %d", userInput, calculatedValue);
	}
}
