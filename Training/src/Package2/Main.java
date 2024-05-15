package Package2;

import java.util.ArrayList;
import java.util.List;

class Parent1 {
    public String name;
    public int age;
    
    public void say () {
        System.out.println("I am a parent");
    }
}

class Son extends Parent1 {
    public String bestFriendName = "Billy";
    
    @Override
    public void say () {
        System.out.println("I am a son");
    }
    
    public void friend () {
        System.out.println("The name of my best friend is " + this.bestFriendName);
    }
}

class Daughter extends Parent1 {
    public String bestFriendName = "Anna";
    
    @Override
    public void say () {
        System.out.println("I am a daughter");
    }
    
    public void friend () {
        System.out.println("The name of my best friend is " + this.bestFriendName);
    }
}

public class Main {

    public static void main(String[] args) {
        
        // Normal casting
        Son c = new Son();
        c.say();
        c.friend();
        
        System.out.println("--------------");
        
        // Upcasting
        Parent1 p = new Son();
        p.say();
        //p.friend(); // I cannot execute this method because Parent doesn't have it
        
        Parent1 p2 = new Daughter();
        p2.say();
        
        System.out.println("--------------");
        
        // Downcasting
        Son c2 = (Son) p; // Only possible if explicitly performed through the casting (Child)
        c2.say();
        c2.friend();
        
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        
        // Mixing everything
        List<Parent1> family = new ArrayList<Parent1>();
        family.add(c);
        family.add(p);
        family.add(p2);
        family.add(c2);
        
        for (Parent1 member : family) {
            member.say();
        }
    }
}
