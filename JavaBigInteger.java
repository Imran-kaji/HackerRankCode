import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        BigInteger addResult = A.add(B);
        BigInteger mulResult = A.multiply(B);

        System.out.println(addResult);
        System.out.println(mulResult);
    }

}

// output format

//        123456789
//        100000000000000000
