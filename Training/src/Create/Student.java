package Create;

public class Student implements Comparable<Student>{
	int no;  
	String name;  
	int marks;  
	
	public Student(int no, String name, int marks) {
		super();
		this.no = no;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student s) {
//		return Integer.compare(this.no, s.no);
		if(this.no == s.no) {
			return 0;
		} else if(this.no > s.no) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return no+" "+name+" "+marks;
	}
}
