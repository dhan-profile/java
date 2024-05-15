package Package2;

class Bike {

	private String company = "Honda";
	private String type = "Two Wheeler";
	public void show() {
		System.out.println("Company: " + company);
		System.out.println("Type: " + type);
	}
}
	class Honda extends Bike{
		String name = "Shine";
		int mileage = 40;
		public void show() {
			System.out.println("Name: " + name);
			System.out.println("Mileage: " + mileage);
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
	
	public class AllBike{
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
	}
}
