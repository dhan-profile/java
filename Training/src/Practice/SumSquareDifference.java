package Practice;

public class SumSquareDifference {

	public static void main(String[] args) {
		long sum = 0, sum2 = 0;
		for(int i=1; i<=100; i++) {
			int num = square(i);
			sum = sum + num;
			sum2 = sum2 + i;
		}
		long diff1 = sum2*sum2; 
		System.out.println(sum);
		System.out.println(diff1);
		System.out.println(diff1-sum);
	}

	private static int square(int i) {
		return i*i;
	}

}
