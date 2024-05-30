package Package1;

import Practice.LinkedHashMap1;

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

	class Bike{
//		final int b;
//		final blank variable cannot be declared outside 
		
		Bike(){
			final int b;
			// final blank variable can be declared inside constructor 
		}
	    void method(int a)  
	    {  
	        System.out.println("Base class method called with integer a = "+a);  
	    } 
	       
	    void method(double d)  
	    {  
	        System.out.println("Base class method called with double d ="+d);  
	    }  

	public void caller() {
		final int a;
//		final blank variable can be declared inside method
		System.out.println("Bikeclass");
	}
}
	
	class Biker extends Bike{
	    void method(double d)  
	    {  
	        System.out.println("Derived class method called with double d ="+d);  
	    }  
	}
	
	public class Car{
	public static final void main(String[] args) {
		NewCar car = new NewCar();
		car.setName("Toyota");
		car.setModel("Fortuner");
		car.setYear(2010);
		System.out.println("Company name: " + car.getName());
		System.out.println("Model name: " + car.getModel());
		System.out.println("Year : " + car.getYear());
		System.out.println("Mileage : " + car.getMileage());
		
//		Car obj = new Bike();
		final int s;
//		final blank variable can be declared locally
		new Biker().method(10.5);  
		System.out.println("========================");
		LinkedHashMap1 lhm = new LinkedHashMap1();
		lhm.main(null);
	}
}
