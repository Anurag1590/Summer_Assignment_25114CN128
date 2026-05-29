import java.util.*;
public class Question_5 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int n1=n;
        int sum =0;
        int r =0;
        while(n>0)
        {
            r = n%10;
            sum = sum +r;
            n =n/10;
        }
        System.out.println("The sum of digits of "+n1+" is "+sum);
    }
}
