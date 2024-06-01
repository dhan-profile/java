package Practice;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 14);
		System.out.println(map.getOrDefault('a', 1));	
		// returns value of key so default has to be of value Type
		
	}
}
