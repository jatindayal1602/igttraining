class A {

    private int a = 1;//only for single class
    public int b = 2;//every where
    protected int c = 3;// same package || child class in other package
    int d = 4;//same package

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class B extends A{
    void display() {
       // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Demo8 {

    public static void main(String[] args)
    {
        A a= new A();
        //System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);


        }

}
