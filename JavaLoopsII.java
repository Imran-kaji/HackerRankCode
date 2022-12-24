import java.util.Scanner;
public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for (int i=0; i<line; i++){
           int a=  sc.nextInt();
           int b=  sc.nextInt();
           int n=  sc.nextInt();
           int sum = a;
            for (int j=0; j<n; j++){
                int pow = (int)Math.pow(2,j)*b;
                sum = sum+pow;
                System.out.printf("%s ",sum);
            }
            if (i< line-1){
                System.out.println("\n");
            }
        }
    }
}
