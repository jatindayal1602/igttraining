
class A{
    A() {
        System.out.println("a()");
    }
    A(int a) {
        System.out.println("a(int a)");
    }
    A(int a,int b) {
        System.out.println("a(int a, int b)");
    }

    void draw(int r)
    {
        System.err.println(r*r*r);
    }
    void draw(int l, int b)
    {
        System.err.println(2*(l+b));
    }

}

class Demo6 {

    public static void main(String args[])
    {
        A a= new A();
        A a1= new A(1);
        A a2= new A(1,2);
        a.draw(3);
        a.draw(2,5);
    }

}
