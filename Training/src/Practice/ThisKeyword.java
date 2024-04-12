package Practice;

public class ThisKeyword {
	int custid;
	String name;
	String location;
	ThisKeyword(int custid, String name, String location){
		this.custid = custid;
		this.name = name;
		this.location = location;
		
		//custid = custid;
		//name = name;
		//location = location;
	}
	public void display() {
		System.out.println("Customer ID: " + custid);
		System.out.println("Name: " + name);
		System.out.println("Location: " + location);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk = new ThisKeyword(101, "Dhan", "India");
		tk.display();
	}

}
