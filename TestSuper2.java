class Animal {
void eat() {System.out.println("eating...");}
}
class Dog extends Animal{
void eat() {System.out.println("eating bread...");}
void bark() {System.out.println("barking...");}
void work() {
super.eat();	// calls the superclass method
bark();
eat();}
}
class TestSuper2{
public static void main(String args[]) {
Dog d = new Dog();
d.work();
}}
