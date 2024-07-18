package Package2;

//=====================
//PRACTICE - Declaration check
//==================
interface Addition{
	abstract void comp();
}
class Foo {
	Addition h2 = new Addition() {
		public void comp() {
			System.out.println("Comparision");
		}
	};
}
abstract class Foo1{
	protected abstract void comp2();
	@SuppressWarnings("unused")
	private void cmop2() {
		
	}
}
//=======================
class Bike {

	Bike(){
		System.out.println("construct");
	}
	private String company = "Honda";
	private String type = "Two Wheeler";
	public void show() {
		System.out.println("Company: " + company);
		System.out.println("Type: " + type);
	}
	public static void five() {
		
	}
}
	class Honda extends Bike{
		String name = "Shine";
		int mileage = 40;
		public void show() {
			System.out.println("Name: " + name);
			System.out.println("Mileage: " + mileage);
		}
		public static void five() {
			
		}
	}
	
	class Hero extends Bike{
		String name = "Spleandor";
		int mileage = 44;
		public void show() {
			System.out.println("Name: " + name);
			System.out.println("Mileage: " + mileage);
		}
	}
	
	public class AllBike {
	public static void main(String[] args) {
		Bike obj1 = new Bike();
		Honda obj2 = new Honda();
		Hero obj3 = new Hero();
//		Bike b1 = new Honda();
		Bike b1 = (Bike)new Honda();
//		Honda h1 = (Honda)obj1;
		obj1.show();
		obj2.show();
		obj3.show();
		b1.show();
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	}
	
	abstract class Template{
		Template(){
			
		}
		abstract void sum();
		final static void add() {
			System.out.println((((((("abstract class method")))))));
		}
	}
	
	interface Temp {
		abstract void note();
		void book();
		
		public static void call() {
			System.out.println("interface method");
		}
	}
}
