package Package2;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
interface Inter{
	public void custom(int n);
}
public class Arrays2 {

	public void get(int n) {
		System.out.println("Success " + n);
	}
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
			System.out.print(num);	
		}
		System.out.println();
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(30);
		arr.add(14);
		arr.add(28);
//		arr.forEach(val -> System.out.print(val+" "));
		arr.forEach(System.out::println);
		
		Inter i = num -> System.out.println(num);
		i.custom(100);
		
		i = new Arrays2()::get;  
		i.custom(100);
		
		List<Integer> list = Arrays.asList(1,2,7,3,6,4,5);
		list.forEach(System.out::print);
	}

}
