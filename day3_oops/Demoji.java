package day3_oops;

public class Demoji{
    public static void main(String[] args)
    {
        String s1="Ramesh";
        String s2="Ramesh";
        String s3=new String("Ramesh");
        String s4=new String("Ramesh");
    
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s5=new String("ramesh");
        System.out.println(s5.equals(s4));
        System.out.println(s5.equalsIgnoreCase(s4));
        s1.concat("Kumar");
        System.out.println(s1);

        StringBuffer sb=new StringBuffer("Ramesh");
        sb.append("kumar");
        System.out.println(sb);


    }
}
