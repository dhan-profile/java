package Package2;

public class StudentClass{
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails(101, "Dhanush", "java", 'A') {
			@Override
			public void subject() {
				System.out.println("Subject: " + this.subject);
			}
			
			@Override
			public void grade() {
				System.out.println("Grade: " + this.grade);
			}
		};
		student.rollno();
		student.name();
		student.subject();
		student.grade();
	}
}
