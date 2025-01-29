
class Emp {

}

class Address {

    int pin = 110009;
    String street = "4/d main road";

}

class Clerk extends Emp {

    Address a = new Address();

    void display() {
        System.out.println("pin :" + a.pin);
    }

}

class Dev extends Emp {

}

class Demo5 {

    public static void main(String[] args) {
        Clerk c = new Clerk();
        c.display();

    }
}
