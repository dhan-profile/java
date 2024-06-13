package Programs;
import java.util.*;
import java.util.stream.Collectors;
class StreamPractice{
	public static void main(String[] args){
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Hello");
		m.put(2, "Java");
		m.put(3, "Programming");
		m.put(5, null);
		m.put(6, null);
		System.out.println(m);
		m.entrySet().stream().forEach(t -> System.out.println(t+" "));
//		======================
//		converting Map to List
//		======================
		List<String> str = m.values().stream().collect(Collectors.toList());
		System.out.println(str);
		
//		=============================
//		even numbers in array to list
//		=============================
		Integer[] arr = {23, 54, 87, 65, 12, 97};
		List<Integer> list = Arrays.stream(arr).filter(v -> v%2==0).collect(Collectors.toList());
		System.out.print(list+"\n");
		
//		==================================
//		square of numbers in array to list
//		==================================
		System.out.println("The list: "+Arrays.asList(arr));
		List<Integer> square = Arrays.stream(arr).map(v -> (v*v)).collect(Collectors.toList());
		System.out.print(square+"\n");
		
//		=====================================
//		find max value in array of Integer type
//		=====================================	
		Optional<Integer> max = Arrays.stream(arr).max(Comparator.naturalOrder());
		System.out.println(max);
		
		int sup[] = {3, 5, 2, 1, 6}; 
		OptionalInt max2 = Arrays.stream(sup).max();
		System.out.println(max2);

//		==================================
//		convert string array to upper case
//		==================================
		String[] str2 = {"Hello", "Java", "Programming"};
		Arrays.stream(str2).map(s -> s.toUpperCase()).forEach(t -> System.out.print(t+" "));
		System.out.println();
		
//		==================================
//		filter names starting with letter 'A'
//		==================================		
		String names[] = {"James", "Olivia", "Michael", "Emma", "William", "Ava", 
					"Benjamin", "Sophia", "Isabella", "Mia","Alexander", "Amelia", 
					"Mason", "Harper", "Ethan", "Evelyn", "Daniel", "Abigail"};
		List<String> namesStartingA = Arrays.asList(names);
		namesStartingA.stream().filter(s -> s.startsWith("A")).forEach(v -> System.out.print(v+" "));
	}
}
