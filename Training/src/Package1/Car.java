package Package1;

class NewCar {

	private String company_name;
	private String model_name;
	private int year;
	private int mileage = 35;
	
	public String getName() {
		return company_name;
	}
	public String getModel() {
		return model_name;
	}
	public int getYear() {
		return year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setName(String name) {
		this.company_name = name;
	}
	public void setModel(String model) {
		this.model_name = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
	
	public class Car{
	public static void main(String[] args) {
		NewCar car = new NewCar();
		car.setName("Toyota");
		car.setModel("Fortuner");
		car.setYear(2010);
		System.out.println("Company name: " + car.getName());
		System.out.println("Model name: " + car.getModel());
		System.out.println("Year : " + car.getYear());
		System.out.println("Mileage : " + car.getMileage());
	}

}
