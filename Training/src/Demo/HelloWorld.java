package Demo;

import java.util.Optional;

public class HelloWorld {
	HelloWorld(){
		System.out.println("Created object using newInstance()");
	}
	public static void main(String[] args) {
//		Number num1 = 10, num2 = 20;
//		Number sum = num1.intValue() + num2.intValue();
//		System.out.println(sum);
//		System.out.println("\n BackSlash");

//		
//	public static void main(String... args) {
//		 System.out.println(″This is not a String″);
//		}
		
//	============ Creating OBJECT using newInstance() =============================
    try {
	HelloWorld obj = HelloWorld.class.newInstance();
    } catch(Exception e) {
    	System.out.println(e);
    }
}
}
