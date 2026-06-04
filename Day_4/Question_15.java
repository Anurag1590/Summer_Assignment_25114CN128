//Code to check whether a number is Armstrong number or not.
import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int n1=n;
        int count =0;
        double arm =0;
        while(n>0)
        {
          count++;
          n =n/10;
        }
        n = n1;
        while(n>0)
        {
           int r =n%10;
           arm = arm + Math.pow(r,count);
           n = n/10;
        }
        if(n1==arm)
        {
            System.out.println(n1+" is an Armstrong number");
        }
        else
           System.out.println(n1+" is not an Armstrong number");   
    }
}
