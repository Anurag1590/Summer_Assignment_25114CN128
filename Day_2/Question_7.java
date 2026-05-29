import java.util.*;
public class Question_7 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int n1=n;
        int product =1;
        int r =0;
        while(n>0)
        {
            r = n%10;
            product = product*r;
            n =n/10;
        }
        System.out.println("The product of digits of "+n1+" is "+product);
    }
}

