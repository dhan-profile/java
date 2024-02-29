import java.util.*;
class Box{
	float x = 1;
	float y = 2;
	float length = 12;
	float width = 6;
	double area(){
		return(length*width);
	}
}

class Circle{
	float x = 11;
	float y = 12;
	float radius = 5;
	double area(){
		return(3.14 * radius * radius);
	}
}

class ScopeRule{
	static float x = 10;
	float y = 20;
public static void main(String args[])	{
	Box b1 = new Box();
	Circle c1 = new Circle();
	System.out.println("Main class data: " + x);
	System.out.println("Box class data: " + b1.x);
	System.out.println("Circle class data: " + c1.x);
	System.out.println("======================");
	System.out.println("Box Area: " + b1.area());
	System.out.println("Circle Area: " + c1.area());
}
}