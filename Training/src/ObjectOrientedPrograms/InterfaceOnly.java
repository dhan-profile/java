package ObjectOrientedPrograms;

public interface InterfaceOnly {
//	FIELDS
	static int n1=1;
	public int n2 = 2;
	final int n3 = 3;
//	-------------------------------
//	METHODS
	void start();	// By default it is abstract and public
	public void end();
	abstract void start1();
//	----------------------------------
	private void start2() {
//		PRIVATE METHOD should be defined in { }
		System.out.println("Started");
	}
	static void start3() {
//		STATIC METHOD
	}
	default void start4() {
//		DEFAULT METHOD
	}
}

interface Note{
	
}

abstract class Furniture{
	public abstract void type();
	
	interface Sound{
		class Speaker{
			void call(){
				
			}
			interface Audio{
				class Volume{
					Speaker s1 = new Speaker();
					Audio a1 = (Audio)s1;
					
				}
			}
		}
	}
}