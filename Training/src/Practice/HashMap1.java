package Practice;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 36);
		map.put('y', 12);
		map.put('b', 45);
		map.put('e', 27);
		map.put('c', 83);
		
		System.out.println("map: "+map);
		
//		getOrDefault(key1, defaultValue) --> get the "Value" for key1, if not "defaultValue" will be obtained  
		System.out.println("map.getOrDefault('a', 1) : "+map.getOrDefault('a', 1));	
		System.out.println("map.containsKey('c') : "+map.containsKey('c'));
		System.out.println("map.containsValue(45) : "+map.containsValue(45));
		
//		entrySet() --> get ALL "KeyValue" in map 
		System.out.println("map.entrySet() : "+map.entrySet());
		
//		get(key) --> get the "Value" of key given
		System.out.println("map.get('y') : "+map.get('y'));
		
//		get(key, defaultValue) --> get the "Value" of key given, if not defaultValue will be get 
		System.out.println("map.getOrDefault('f', 20) : "+map.getOrDefault('f', 20));
		
		
	}
}
