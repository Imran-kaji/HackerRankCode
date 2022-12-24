import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String current_sub =s.substring(0,k);
        String smallest = current_sub;
        String largest = current_sub;
        
        
        for( int i=1; i<=s.length()-k; i++)
        {
            current_sub= s.substring(i,i+k);
            if(current_sub.compareTo((largest))>0)
            {
                largest = current_sub;
            }
            if(current_sub.compareTo((smallest))<0)
            
            smallest = current_sub;
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


// Output format

// welcometojava
// 3
