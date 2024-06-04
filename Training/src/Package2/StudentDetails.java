package Package2;

abstract class StudentDetails implements StudentInterface{
	int no; 
	String name;
	String subject;
	char grade;
	
	StudentDetails(int no, String name, String subject, char grade){
		this.no = no;
		this.name = name;
		this.subject = subject;
		this.grade = grade;
	}
	@Override
	public void rollno() {
		System.out.println("Roll no: " + this.no);
	}
	@Override
	public void name() {
		System.out.println("Name: " + this.name);
	}
}

