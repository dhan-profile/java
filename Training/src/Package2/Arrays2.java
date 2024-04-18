package Package2;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = {1,2,3,4,5};
		int  b[] = {6,7,8,9,10};
		int j=a.length;
		int c[] = new int[10];
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i=0; i<b.length; i++) {
			c[j+i] = b[i];
		}
		for(int num : c) {
			System.out.println(num);	
		}
	}

}
