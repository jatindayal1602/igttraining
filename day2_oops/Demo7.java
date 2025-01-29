class Bank
{
    Bank(){}

    void roi(){
        System.out.println("bank rate 10%");
    }
}
class Sbi extends Bank{

}

class Axis extends Bank{
    void roi(){
        System.out.println("bank rate 12%");
    }
}

class Demo7 {
    public static void main(String args[])
    {
        Sbi s= new Sbi();
        s.roi();
        Axis a =new Axis();
        a.roi();


    }
}
