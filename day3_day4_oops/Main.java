package day3_day4_oops;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        t1.start();
        t2.start();

        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
    }
}