import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            try{
                Pattern.compile(in.nextLine());
                System.out.println("Valid");
            }

            catch (Exception e){
                System.out.println("Invalid");

            }
            testCases--;

        }
    }
}
