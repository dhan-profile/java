package Package1;

import Package2.*;
public class One extends Two{

		public static void main(String[] args) {
		Two obj = new Two();
		One obj2 = new One();
		obj.display1();
		obj2.display2();
		//obj.display3();
		//obj.display4();

	}

}
