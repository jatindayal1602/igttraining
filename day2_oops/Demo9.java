// Fully Encapsulated Class
class Person {
    // Private variables (Data Hiding)
    private int id;
    private String name;

    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main Class to Test Encapsulation
public class Demo9 {
    public static void main(String[] args) {
        // Creating an object of Person
        Person person = new Person(101, "Alice");

        // Displaying initial values
        person.display();

        // Modifying values using setters
        person.setId(102);
        person.setName("Bob");

        // Displaying updated values
        person.display();
    }
}
