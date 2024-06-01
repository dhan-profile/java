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
		return o2.compareTo(o1);
	}
}
public class TreeMap2 {
    public static void main(String[] args){
    	
//    	METHOD-1: Creating object and passing object to comparator 👇
//    	==========================================================
//    	Here we have not called compare() method because, by default TreeMap calls comparator.
//    	Every time, we add key-value pair to map, it calls comparator to sort it.
//    	Because TreeMap is a sorted map, it sorts in ascending order by default.
    	
    	DescendingComparator dc = new DescendingComparator();
    	TreeMap<Integer, String> map =new TreeMap<Integer, String>(dc);
    	
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
    	
        map.put(8,"mango");
        map.put(2,"grapes");
        map.put(6,"blueberry");
        map.put(1,"papaya");

        System.out.println(map);
        System.out.println("map.get(6) : "+map.get(6));
        
        System.out.println("map.keySet() : "+map.keySet());
        
//        System.out.println(map.pollFirstEntry());
//        System.out.println(map.pollLastEntry());
        
//       System.out.println(map.firstEntry());
//        System.out.println(map.lastEntry());
//        
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
       
       
       // --------------Sorted map -------------------
//        System.out.println(map.ceilingEntry(5));
//        System.out.println(map.ceilingKey(5));
//        System.out.println(map.floorEntry(5));
//        System.out.println(map.floorKey(5));
//               
//        System.out.println(map.headMap(6));
//        System.out.println(map.tailMap(6));
//        
//        System.out.println("Submap: "+map.subMap(1,8));
        
       
       
       
        
        // -----------------Navigable map ------------------
//        System.out.println(map.higherEntry(5));
//        System.out.println(map.higherKey(5));
//        System.out.println(map.lowerEntry(5));
//        System.out.println(map.lowerKey(5));
//        
//        System.out.println(map.headMap(6, true));
//        System.out.println(map.tailMap(6, false));
//        
//        System.out.println(map.descendingKeySet());
//       
//        
//        
//    
//        System.out.println("NAvigable Submap: "+map.subMap(1,false,8,true));
//        
        
//        Map<Integer, String> m =  map.descendingMap();
//        
//        System.out.println(m);
                
}
    
    
}
