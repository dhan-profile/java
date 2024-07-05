package interfacesDemo;

public abstract class Cars implements Vehicle{
	Vehicle v1 = new Vehicle() {

		@Override
		public int mileage() {
			return 0;
		}

//		@Override
//		public int price() {
//			return 0;
//		}
		
	};
}


