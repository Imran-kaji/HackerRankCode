import java.util.*;
public class PrimalityTest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //int num = 9;
            int a = sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= a / 2; ++i) {
                // condition for nonprime number
                if (a % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println("prime ");
            else
                System.out.println("not prime ");
        }
}