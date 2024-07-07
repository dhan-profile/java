package ObjectOrientedPrograms;

interface Colorable {
	void setColor(byte r, byte g, byte b);
}

class Point { int x, y; }

class ColoredPoint extends Point implements Colorable {
    byte r, g, b;
    public void setColor(byte rv, byte gv, byte bv) {
        r = rv; g = gv; b = bv;
        System.out.println("RED:"+r);
        System.out.println("GREEN:"+g);
        System.out.println("BLUE:"+b);
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Point p = new Point();
        ColoredPoint cp = new ColoredPoint();
        p = cp;
        Colorable c = cp;
        c.setColor((byte)1, (byte)2, (byte)3);
    }
}
