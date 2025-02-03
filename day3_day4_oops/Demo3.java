package day3_day4_oops;


sealed class Vehicle permits Car, Bike { 
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}



non-sealed class Car extends Vehicle {
    Car(String brand) {
        super(brand);//constructor call of parent class
    }
}

final class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");

        car.displayBrand(); 
        bike.displayBrand();
    }
}
