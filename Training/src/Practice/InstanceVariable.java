package Practice;

class InstanceVariable{
	public int num1;
	private int num2;
	protected int num3;
	public InstanceVariable() {
		
	}
	public InstanceVariable(int num1) {
		this.num1 = num1;
	}
	
	public static void main(String[] arg){
		InstanceVariable iv = new InstanceVariable(10);
		Instance1 i1 = iv.new Instance1();
		Instance2 i2 = iv.new Instance2();
		Instance3 i3 = iv.new Instance3();
		i1.display();
		i2.display();
		i3.display();
		int[] n = {};
		System.out.println(n);
		for (int i = 0; i<4 ; i++) {
			System.out.print(i + " ");
		}
	}
	
	class Instance1{
		public void display(){
			num1 = 10;
			System.out.println("Public Int : class 1");
		}
	}
	
	class Instance2{
		public void display(){
			num2 = 20;
			System.out.println("Private Int : class 2");
		}	
	}
	
	class Instance3{
		//num3 = 30;
		public void display(){
			System.out.println("Protected Int : class 3");
		}	
	}
}






