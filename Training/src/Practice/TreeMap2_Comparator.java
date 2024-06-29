package Practice;

import java.util.*;

class DescendingComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1 > o2) {
//			return -1;
//		} else if(o2 > o1) {
//			return 1;
//		}
//		return 0;
		return o1.compareTo(o2);
	}
}

public class TreeMap2_Comparator {
	public static void main(String[] args) {

//    	METHOD-1: Creating object and passing object to comparator 👇
//    	==========================================================
//    	Here we have not called compare() method because, by default TreeMap calls comparator.
//    	Every time, we add key-value pair to map, it calls comparator to sort it.
//    	Because TreeMap is a sorted map, it sorts in ascending order by default.

		DescendingComparator dc = new DescendingComparator();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(dc);

//    	METHOD-2: Creating Anonymous Inner Class in map constructor() call itself 👇
//    	=======================================================================
//        TreeMap<Integer, String> map =new TreeMap<Integer, String>(new Comparator<Integer>()
//                                                                            {
//                                                                                public int compare(Integer p1,Integer p2){
//                                                                                if(p1>p2)
//                                                                                    return -1;
//                                                                                else if(p1<p2)
//                                                                                    return 1;
//                                                                                else 
//                                                                                    return 0;
//                                                                            }
//                                                                        });
//        Defining Comparator to sort in Descending order by overriding compare method
//        Using anonymous inner class

//    	METHOD-3: Using Anonymous Object, passing it directly to map constructor() 👇
//    	==========================================================================
//    	TreeMap<Integer, String> map =new TreeMap<Integer, String>(new DescendingComparator());

		map.put(8, "mango");
		map.put(2, "grapes");
		map.put(7, "apple");
		map.put(6, "blueberry");
		map.put(1, "papaya");
		map.put(5, "pineapple");
		map.put(3, "strawberry");
		System.out.println(map);

//       get(key) --> get the "Value" of key given | keySet() --> to get "Keys" without "Values" 
		System.out.println("map.get(6) : " + map.get(6));
		System.out.println("map.keySet() : " + map.keySet());
		System.out.println(map);

//        Poll() --> Removes elements from map 
		System.out.println("map.pollFirstEntry() : " + map.pollFirstEntry());
		System.out.println("map.pollLastEntry() : " + map.pollLastEntry());
		System.out.println("map : " + map);

//        firstEntry() & lastEntry() --> get first & last "KeyValue" in map (given Asc/Desc)
		System.out.println("map.firstEntry() : " + map.firstEntry());
		System.out.println("map.lastEntry() : " + map.lastEntry());
		System.out.println("map : " + map);

//        firstKey() & lastKey() --> get firstKey & lastKey in map (given Asc/Desc)
		System.out.println("map.firstKey() : " + map.firstKey());
		System.out.println("map.lastKey() : " + map.lastKey());
		System.out.println("map : " + map);

		System.out.println("==================SORTED MAP====================");
//      ceilingEntry --> get the nearest higher "KeyValue" (RIGHT SIDE) 
//      ceilingKey --> get the nearest higher "Key" (RIGHT SIDE)
		System.out.println("map.ceilingEntry(4) : " + map.ceilingEntry(4));
		System.out.println("map.ceilingKey(5) : " + map.ceilingKey(5));

//      floorEntry --> get the nearby "KeyValue" less than given (LEFT SIDE)
//        floorKey --> get the Highest nearby "Key" (LEFT SIDE)
		System.out.println("map.floorEntry(4) : " + map.floorEntry(4));
		System.out.println("map.floorKey(4) : " + map.floorKey(4));
		System.out.println("map : " + map);

//      headMap(key) --> get all "KeyValues" from HEAD to given (KEY-1)
//      tailMap(key) --> get all "KeyValues" from TAIL to given KEY
		System.out.println("map.headMap(6) : " + map.headMap(6));
		System.out.println("map.headMap(6, true) : " + map.headMap(6, true));
		System.out.println("map.tailMap(3) : " + map.tailMap(3));
		System.out.println("map.tailMap(3, true) : " + map.tailMap(3, false));

//        subMap(key1, key2) --> get the values from "Key1" to "Key2-1" 
		System.out.println("map.subMap(1,8) : " + map.subMap(3, 6));
//        System.out.println("map.subMap(1,8) : "+map.subMap(6,2));

		System.out.println("-----------------Navigable map ------------------");
		System.out.println("map : " + map);
//      higherEntry(key) --> get "KeyValue" higher than given key
//      higherKey(key) --> get "Key" higher than given key
		System.out.println("map.higherEntry(5) : " + map.higherEntry(5));
		System.out.println("map.higherKey(5) : " + map.higherKey(5));

//      lowerEntry(key) --> get "KeyValue" lower than given key
		System.out.println("map.lowerEntry(5) : " + map.lowerEntry(5));
		System.out.println("map.lowerKey(5) : " + map.lowerKey(5));

//        descendingKeySet --> get the "Keys" in descending order
		System.out.println(map.descendingKeySet());
//		
		System.out.println("Navigable Submap: map.subMap(2,false,8,true) : " + map.subMap(2, false, 8, true));

		Map<Integer, String> m = map.descendingMap();
		System.out.println(map);
	}
}
