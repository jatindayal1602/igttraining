package day3_day4_oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException{
        m1();
    }
    static void m1() throws FileNotFoundException{
        m2();
        System.out.println("hi method m1");
    }
    static void m2() throws FileNotFoundException{
        m3();
        System.out.println("hi method m2");

    }
    static void m3() throws FileNotFoundException{
       
        File f = new File("jatin.txt");
        FileReader fr= new FileReader(f);

        throw new FileNotFoundException("file not found");
    }
    
}
