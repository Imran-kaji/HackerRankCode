import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //No. of inputs
        int n =sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for(int i=1; i<n ; i++){
            for(int j=i; j>=1; j--){

                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;

                }else{
                    break;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}