package day3_day4_oops;

class Parentclass {
    Parentclass() {
        System.out.println("Parent Class Constructor Called");
    }
}

// Child Class
class Child extends Parentclass {
    Child() {
        this(10); // Calls parameterized constructor of Child class
        System.out.println("Child Default Constructor Called");
    }

    Child(int x) {
        super(); // Calls Parent class constructor
        System.out.println("Child Parameterized Constructor Called with value: " + x);
    }
}

// Main Class
public class Parent {
    public static void main(String[] args) {
        Child obj = new Child(); // Creates Child object, calls constructors
    }
}
