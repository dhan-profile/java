package Package2;

	class Parent {
		volatile int a = 10;
		String name = "PARENT CLASS";
		void method()
		{
			System.out.println("Method from Parent");
		}
	}

	class Child extends Parent {
		int id = 5;
		@Override void method()
		{
			System.out.println("Method from Child");
		}
	}

	public class TypeCasting1 {
		public static void main(String[] args)
		{
			Parent p = new Child();
			p.name = "ParentClassVar";
			System.out.println(p.name);
			p.method();
			// Trying to Downcasting Implicitly
			// Child c = new Parent(); - > compile time error
			// Downcasting Explicitly - converting object of parent class type to child type
			Child c = (Child)p;

			c.id = 1;
			System.out.println(c.name);
			System.out.println(c.id);
			c.method();
		}
	}

