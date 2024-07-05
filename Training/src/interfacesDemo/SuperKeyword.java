package interfacesDemo;

interface I { int x = 0; }
class T1 implements I { int x = 1; }
class T2 extends T1   { int x = 2; }
class T3 extends T2 {
    int x = 3;
    void test() {
        System.out.println("x=\t\t"+ x);
        System.out.println("super.x=\t"+ super.x);
        System.out.println("((T2)this).x=\t" + ((T2)this).x);
        System.out.println("((T1)this).x=\t" + ((T1)this).x);
        System.out.println("((I)this).x=\t"  + ((I)this).x);
    }
}
class SuperKeyword {
    public static void main(String[] args) {
        new T3().test();
    }
}
