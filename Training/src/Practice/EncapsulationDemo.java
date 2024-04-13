package Practice;

public class EncapsulationDemo {
		private long acc_no;
		private String name;
		private String mailid;
		private float amount;
		
		//getter
		public long getAccno() {
			return acc_no;
		}
		//setter
		public void setAccno(long acc_no) {
			this.acc_no = acc_no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMail() {
			return mailid;
		}
		public void setMail(String mailid) {
			this.mailid = mailid;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		
		public static void main(String[] args) {
			EncapsulationDemo obj = new EncapsulationDemo();
			obj.setAccno(654896884);
			obj.setAmount(100000);
			obj.setMail("dhan@gmail.com");
			obj.setName("Dhan");
			System.out.println("Name: " + obj.getName() + '\n' + 
					"Account no: " + obj.getAccno() + '\n' + 
					"Email id: " + obj.getMail() + '\n' + 
					"Amount: " + obj.getAmount());
	}
}

/*
We can create a fully encapsulated class by making all data members of the class private.
Now, we can use getter and setter to get and set data to it.
*/