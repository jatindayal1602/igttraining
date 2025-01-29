class Parent{

    int site =5;
    int money=50000;
    String car="Benz";
    

}

class Child extends Parent{
    int money =60000;

    void display(int money)
    {
        System.out.println("site :"+site);
        System.out.println("child money :"+money);
        System.out.println("parent money :"+super.money);
        System.out.println("car :"+car);
    }
}

class Demo1{
    public static void main(String[] args)
    {
        Child c= new Child();
        c.display(9099);

    }
}
