import java.util.Scanner;
class Test{
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n/2;
		System.out.println("n/2: " + res);		
		int res2 = n % 2;
		System.out.println("n%2: " + res2);
	}
}