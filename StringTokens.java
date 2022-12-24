import java.util.*;
public class StringTokens
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        StringTokenizer st = new StringTokenizer(text,("['!?,._@ ]+"));

         // split string from space
         //String[] result = text.split("['!?,._@ ]+");
        int count = st.countTokens();
        System.out.println(count);

        for (int i = 0; i < count; i++)
        {
            System.out.print(st.nextToken() + "\n");
        }
    }
}