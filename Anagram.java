//package HackerRankCode;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");

        String name = sc.nextLine();
        System.out.println("Enter the second name:");
        String name2 = sc.nextLine();
        String rev = "";
        sc.close();

        for(int i=name.length()-1; i>=0; i--)
        {
            rev = rev+name.charAt(i);
        }

         if  (name.equalsIgnoreCase(name2))
        {
            System.out.println("Anagrams");
        }
        else if (name2.equalsIgnoreCase(rev) )
        {
            
            System.out.println("Anagrams");
        }

        else{
            System.out.println("Not Anagrams");
        }
    }
}