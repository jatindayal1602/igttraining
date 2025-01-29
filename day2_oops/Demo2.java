class Parent{

    int site =1000;


}

class Child extends Parent{
    int site =100;

    void display(int site)
    {
        System.out.println("site :"+site);
        System.out.println("site :"+this.site);
        System.out.println("site :"+super.site);
    }

}

class Demo2{
    public static void main(String[] args)
    {
        Child c= new Child();
        c.display(10);

    }
}
