import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        while (input--!=0){
            String Unames = sc.nextLine();
            if(Unames.matches(UsernameValidator.regularExpression)){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
    }