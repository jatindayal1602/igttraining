public class Demo3 {
    public static void main(String[] args) {
        Child c = new Child();

    }
}

class Parent {

    Parent() {
        System.out.println("parent class constructor");

    }

}

class Child extends Parent {
    Child() {
        System.out.println("child class constructor");

    }

}
