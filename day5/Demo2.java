package day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        // Creating an ArrayList that can store different data types using Object
        ArrayList<Object> list = new ArrayList<>();

        // Adding different data type values
        list.add(10);              // Integer
        list.add(20.5);            // Double
        list.add("Hello");         // String
        list.add(true);            // Boolean
        list.add('A');             // Character

        // Iterating using Iterator and hasNext()
        System.out.println("🔹 Iterating using Iterator:");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
