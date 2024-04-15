// File: NewClass3.java
package Practice;

public class NewClass3 extends AbstractClassDemo {
    NewClass3() {
        super();
        System.out.println("This class constructor");
    }

    void method1() {
        System.out.println("abstract class method");
    }

    void method2() {
        System.out.println("This class method");
    }

    public static void main(String[] args) {
        NewClass3 obj = new NewClass3();
        AbstractClassDemo obj1 = new NewClass3(); // upcasting

        obj.method1();
        obj.method2();

        obj1.method1();
        // obj1.method2(); // This will result in a compilation error
    }
}
