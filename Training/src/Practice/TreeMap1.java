package Practice;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(31, "Nissan");
		tm.put(21, "Renault");
		tm.put(41, "Honda");
		tm.put(11, "Toyota");
		System.out.println(tm);
		System.out.println("tm.ceilingEntry(3) : "+tm.ceilingEntry(3));
		System.out.println("tm.ceilingKey(2) : "+tm.ceilingKey(2));
		System.out.println("tm.containsKey(31) : "+tm.containsKey(31));
		
	}

}
