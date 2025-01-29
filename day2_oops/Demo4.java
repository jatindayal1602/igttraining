
import java.util.Scanner;

class Emp {
    int id, age;
    String name;

    Emp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");
        name = sc.next();

        System.out.println("id");
        id = sc.nextInt();

        System.out.println("age");
        age = sc.nextInt();
    }

}

class Manager extends Emp {

    String designation = "Manager";

    int salary = 90000;

    Manager() {
    }

    void display() {
        System.out.println("my name :" + name);
        System.out.println("my id :" + id);
        System.out.println("my age :" + age);
        System.out.println("my salary :" + salary);
        System.out.println("my designation :" + designation);

    }

    void salaryincrement() {
        salary += 40000;
    }
}

class Tester extends Emp {

    String designation = "Tester";

    int salary = 30000;

    Tester() {
    }

    void display() {
        System.out.println("my name :" + name);
        System.out.println("my id :" + id);
        System.out.println("my age :" + age);
        System.out.println("my salary :" + salary);
        System.out.println("my designation :" + designation);

    }

    void salaryincrement() {
        salary += 20000;
    }
}

class Developer extends Emp {

    String designation = "Developer";

    int salary = 50000;

    Developer() {

    }

    void display() {
        System.out.println("my name :" + name);
        System.out.println("my id :" + id);
        System.out.println("my age :" + age);
        System.out.println("my salary :" + salary);
        System.out.println("my designation :" + designation);

    }

    void salaryincrement() {
        salary += 30000;
    }
}

class Clerk extends Emp {

    String designation = "Clerk";

    int salary = 25000;

    Clerk() {

    }

    void display() {
        System.out.println("my name :" + name);
        System.out.println("my id :" + id);
        System.out.println("my age :" + age);
        System.out.println("my salary :" + salary);
        System.out.println("my designation :" + designation);

    }

    void salaryincrement() {
        salary += 10000;
    }
}

class Demo4 extends Emp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch1 = 0, ch2 = 0;
        Manager m = null;
        Developer d = null;
        Tester t = null;
        Clerk c = null;

        do {
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) salary increment");
            System.out.println("4) Exit");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                do {

                    System.out.println("1) Manager");
                    System.out.println("2) Developer");
                    System.out.println("3) Tester");
                    System.out.println("4) Clerk");
                    System.out.println("5) Exit");

                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m = new Manager();
                    }
                    if (ch2 == 2) {
                        d = new Developer();
                    }
                    if (ch2 == 3) {
                        t = new Tester();
                    }
                    if (ch2 == 4) {
                        c = new Clerk();
                    }

                } while (ch2 != 5);
            }
            if (ch1 == 2) {
                do {

                    System.out.println("1) Manager");
                    System.out.println("2) Developer");
                    System.out.println("3) Tester");
                    System.out.println("4) Clerk");
                    System.out.println("5) Exit");

                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m.display();
                    }
                    if (ch2 == 2) {
                        d.display();
                    }
                    if (ch2 == 3) {
                        t.display();
                    }
                    if (ch2 == 4) {
                        c.display();
                    }

                } while (ch2 != 5);
            }
            if (ch1 == 3) {
                do {

                    System.out.println("1) Manager");
                    System.out.println("2) Developer");
                    System.out.println("3) Tester");
                    System.out.println("4) Clerk");
                    System.out.println("5) Exit");

                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m.salaryincrement();
                    }
                    if (ch2 == 2) {
                        d.salaryincrement();
                    }
                    if (ch2 == 3) {
                        t.salaryincrement();
                    }
                    if (ch2 == 4) {
                        c.salaryincrement();
                    }

                } while (ch2 != 5);
            }
            if (ch1 == 4) {
                System.out.println("thank you...");
                System.exit(0);
            }

        } while (ch1 != 4);

        // Manager m = new Manager();
        // m.display();

        // Tester t=new Tester();
        // t.display();

        // Developer d=new Developer();
        // d.display();

        // Clerk c= new Clerk();
        // c.display();

    }
}
