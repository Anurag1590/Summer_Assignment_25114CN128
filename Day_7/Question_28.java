//Code to print reverse of a number using recursion.
import java.util.*;
public class Question_28 {
    public static void main(String[] args) {
 Scanner Sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n = Sc.nextInt();
 int i =0;
  int result = reverse(n,i);
  System.out.println("Reverse of " +n+ " is: " + result);
    }
 public static int reverse(int n, int rev) 
 {
        if (n == 0) 
            {
            return rev;
        }

        return reverse(n / 10, rev * 10 + (n % 10));
    }
}