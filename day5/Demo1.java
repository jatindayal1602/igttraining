package day5;

public class Demo1 {
    public static void main(String[] args) {
        // 1️⃣ Normal For Loop
        System.out.println("🔹 Normal For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Array for looping
        int[] arr = {10, 20, 30, 40, 50};

        // 2️⃣ For-Each Loop
        System.out.println("\n🔹 For-Each Loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
