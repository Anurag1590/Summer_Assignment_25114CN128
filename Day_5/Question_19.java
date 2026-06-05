//Code to print the factors of a number.
import java.util.*;
public class Question_19 {
        public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        System.out.println("The factors of "+n+" are : ");
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
            System.out.print(" "+i);                
            }
        }
}
}