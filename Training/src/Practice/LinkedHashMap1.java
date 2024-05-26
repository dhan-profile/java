package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	static int MAX = 4;
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>(){
		protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
			return size() > MAX;
		}};
		lm.put(0, "zero");
		lm.put(1, "one");
		lm.put(4, "four");
		lm.put(3, "three");
		lm.put(5, "five");
		lm.put(2, "two");
		System.out.println(lm);
		
	}

}
