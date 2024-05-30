package Practice;

	interface iose {
		abstract void call();
		abstract void talk();
		
		int num = 0;
//		num = 10;
	}
	interface type{
		abstract void cat();
		abstract void dog();
	}
	interface zam{
		abstract void cat();
		abstract void dog();
	}

	class wert implements iose, type, zam{
		public void call() {
			System.out.println("I am calling");
		}
		public void talk() {
			System.out.println("I am talking");
		}
		public void cat() {
			System.out.println("I am cat");
		}
		public void dog() {
			System.out.println("I am dog");
		}
		public void at() {
			System.out.println("I am true");
		}
		public void og() {
			System.out.println("I am og");
		}
	}

	public class InterfaceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wert obj = new wert();
		obj.at();
		obj.call();
		obj.talk();
		obj.cat();
		obj.dog();
		obj.og();
	}

}

	/*
	class 	  ---> Extends 	  ---> class
	interface ---> implements ---> class
	interface ---> extends 	  ---> interface
	
	Interface has static constants and abstract methods.
	Interface is used to achieve abstraction and multiple inheritance.
	Interface can have only abstract methods.
	*/