import java.io.*;
import java.util.*;
class HelloJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String A=sc.next();
        String B=sc.next();    
        System.out.println(A.length()+B.length());
        int a = A.compareTo(B);
        sc.close();
        System.out.println(a);
        if ( a<1)
        {
            System.out.println("No");
        }
        else 
        {
            System.out.println("Yes");
        }
       String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
       String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
       System.out.println(outputA+" "+outputB);
    }
}