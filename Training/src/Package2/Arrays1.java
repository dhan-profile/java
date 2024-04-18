package Package2;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20, 30, 40, 50};
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.print("Max value: " + max);
//		for(int i=0; i<a.length; i++) {
//			sum = sum + a[i];
//		}
//		System.out.println(sum);
//		average = sum/5;
//		System.out.println(average);
		
	}

}
