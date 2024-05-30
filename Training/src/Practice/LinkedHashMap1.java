package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

abstract class cov{
	int n;
	cov(){	}
	 static void cvl() {
		
	}
}

interface abs{
	int b=0;
	public static void mn() {
		System.out.println("interface");
	}
}

public class LinkedHashMap1 {

	static int MAX = 4;
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>(){
			//Anonymous class remove eldest entry based on size
		protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
			return size() > MAX;
		}};
		lm.put(0, "zero");
		lm.put(1, "one");
		lm.put(4, "four");
		lm.put(3, "three");
		lm.put(5, "five");
		lm.put(2, "two");
		lm.put(6,"two");
		System.out.println("lm : " +lm);
		lm.clear();
		System.out.println("lm : "+lm);
		System.out.println(lm.putIfAbsent(1, "Toyota"));
		System.out.println("lm : "+lm);
		System.out.println("lm.remove(1) : "+lm.remove(1));
		lm.put(1, "Honda");
		lm.put(2, "Maruthi");
		lm.put(4, "Maruthi");
		lm.put(3, "Toyota");
		System.out.println("lm.remove(2,\"Maruthi\") : " + lm.remove(2,"Maruthi"));
		System.out.println("lm : "+lm);
		System.out.println("lm.get(3) : "+lm.get(3));
		System.out.println("lm.get(2) : "+lm.get(2));
		System.out.println("lm.containsValue(\"Honda\") : "+lm.containsValue("Honda"));
		System.out.println("lm.replace(1, \"Suzuki\") : "+lm.replace(1, "Suzuki"));
		System.out.println("lm : "+lm);
		System.out.println("lm.values() : "+lm.values());
		System.out.println("lm.keySet() : "+lm.keySet());
		System.out.println("lm.size() : "+ lm.size());
		System.out.println("lm.isEmpty() : "+lm.isEmpty());
		if(lm.containsKey(4)) {
			System.out.println("Already Exist!");
		}
		else {
			System.out.println("lm.put(5, \"Volkswagen\") : "+lm.put(5, "Volkswagen"));;
		}
		System.out.println(lm);
	}

}
