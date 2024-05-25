package Practice;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>(); 
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(5, "five");
		System.out.println(map);
		System.out.println("map.putIfAbsent(4, \"four\") : "+map.putIfAbsent(4, "four"));
		System.out.println(map);
		System.out.println("map.containsKey(5) : "+map.containsKey(5));
		System.out.println("map.containsValue(\"seven\") : "+map.containsValue("seven"));
		System.out.println("map.get(3) : "+map.get(3));
		System.out.println("map.getOrDefault(12, \"Not Available\") : "+map.getOrDefault(12, "Not Available"));
		System.out.println("map.replace(5, \"fifty\") : "+map.replace(5, "fifty"));
		System.out.println(map);

		Integer oldKey = 5;
        Integer newKey = 50;
        if (map.containsKey(oldKey)) {
            String value = map.get(oldKey);
            map.remove(oldKey);
            map.put(newKey, value);
        }
        System.out.println(map);
        
        int n = 10;
        Integer num = n;
        System.out.println("map.put(num, \"ten\") : "+map.put(num, "ten"));
        System.out.println(map);
        
        System.out.println(map.values());
        System.out.println("map.size() : "+map.size());
        System.out.println("map.isEmpty() : "+map.isEmpty());
        System.out.println(map.keySet());
        
        Map<Integer, String> map1 = new HashMap<Integer, String>(); 
		map.put(11, "eleven");
		map.put(15, "fifteen");
		System.out.println(map);
		
	}	
}
