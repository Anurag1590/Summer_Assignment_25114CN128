//Code to print recursive sum of digits.
import java.util.*;
public class Question_27 {
    
        public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc .nextInt();
        int result = sum(n);
        System.out.println( "Sum of digits is "+result );
    }
    public static int sum(int x)
    {
        if (x == 0) {
            return 0;
        }

        return (x % 10) + sum(x / 10);
    }
    }
