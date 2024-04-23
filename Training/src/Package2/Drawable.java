package Package2;

public interface Drawable {
	public void draw();
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("Circle: ");
		System.out.println("    ***    ");
		System.out.println("  *******   ");
		System.out.println("  *******  ");
		System.out.println("    ***    ");
	}
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Rectangle:");
		for(int i=0; i<4; i++) {
			for(int j=0; j<30; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Triangle implements Drawable{
	public void draw() {
		System.out.println("Triangle: ");
		int row = 6;  
		for (int i=0; i<row; i++)   
		{  
		for (int j=row-i; j>1; j--)   
		{  
		System.out.print(" ");   
		}   
		for (int j=0; j<=i; j++ )   
		{   
		System.out.print("* ");   
		}   
		System.out.println();   
		}   
	}
}
