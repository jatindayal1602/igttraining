package day3_day4_oops;

class A extends Thread{
	void display() {
		for(int i = 0;i<=10;i++) {
			try {
				System.out.println("I :"+i);
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	void display() {
		for(int j = 0;j<=10;j++) {
			try {
				System.out.println("       J :"+j);
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class C extends Thread{
	void display() {
		for(int k = 0;k<=10;k++) {
			try {
				System.out.println("              K :"+k);
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}
 
}