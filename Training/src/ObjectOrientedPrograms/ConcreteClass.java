package ObjectOrientedPrograms;

public class ConcreteClass {
	int val1, val2;
	ConcreteClass(){
		System.out.println("Music");
	}
	int ConcreteClass(){
//		play();
		System.out.println("Music");
		return 0;
	}
	static void play() {
		System.out.println("Playing");
		new ConcreteClass();
	}
	public static void main(String[] args) {
		play();
//		ConcreteClass ref = new ConcreteClass();
		System.out.println(new ConcreteClass().val1);
	}
}

abstract class Motor extends ConcreteClass{
	
}