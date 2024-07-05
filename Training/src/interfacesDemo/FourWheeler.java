package interfacesDemo;

import java.util.function.Supplier;

public class FourWheeler implements Vehicle{

	public static void main(String[] args) {
        Vehicle car = () -> 20;
        System.out.println(car.mileage());
	}

	@Override
	public int mileage() {
		int km = 40;
		return km;
	}

//	@Override
//	public int price() {
//		return 200000;
//	}
}

class ThreeWheeler extends FourWheeler{
	public int mileage() {
		int km = 30;
		return km;
	}
}

abstract class Bike{
	
}

interface DamagedVehicles extends Vehicle{
	
}