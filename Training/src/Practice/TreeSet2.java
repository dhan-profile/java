package Practice;
import java.util.TreeSet;
import java.util.Comparator;
class DescendingComparator2 implements Comparator<Integer>{
	@Override
	public int compare(Integer n1, Integer n2) {
		if(n1>n2) return -1;
		else if(n2>n1) return 1;
		return 0;
	}
}

class MyNumber implements Comparable<MyNumber> {
    private Integer value;

    public MyNumber(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public int compareTo(MyNumber other) {
        // For descending order
        return other.value.compareTo(this.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
public class TreeSet2 {

	public static void main(String[] args) {
//		TreeSet<Integer> num = new TreeSet<>(new Comparator<Integer>() {
//			public int compare(Integer n1, Integer n2) {
//			if(n1>n2) {
//				return -1;
//			} else if(n2>n1) {
//				return 1;
//			} return 0;
//			}
//		});
		TreeSet<Integer> num = new TreeSet<>(new DescendingComparator2());
		num.add(24);
		num.add(32);
		num.add(56);
		num.add(12);
		num.add(8);
		System.out.println("Using Comparator:");
		System.out.println(num);
        TreeSet<MyNumber> numSet = new TreeSet<>();
        numSet.add(new MyNumber(24));
        numSet.add(new MyNumber(32));
        numSet.add(new MyNumber(56));
        numSet.add(new MyNumber(12));
        numSet.add(new MyNumber(8));
        System.out.println("Using Comparable:");
        System.out.println(numSet);
	}
}
