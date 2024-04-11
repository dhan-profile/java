import java.util.Scanner;
class BinaryToGray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		System.out.print("Its Binary value: ");
		System.out.println(Integer.toBinaryString(n));
		////////////CONVERTING INTEGER - BINARY TO GRAY CODE///////////
		int binary = 0;
        while (n != 0) {
            binary ^= n;
            n >>= 1;
        }
		////////////////////////
		System.out.println("Its gray code: " + binary);
		System.out.print("Its Binary value: ");
		System.out.println(Integer.toBinaryString(binary));
	}
}
