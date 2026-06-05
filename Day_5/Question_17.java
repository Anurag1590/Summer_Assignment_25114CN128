//Code to check whether the number is Perfect number or not.
import java.util.*;
public class Question_17 {
    public static void main(String[] args)
    {
        int n ;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int sum =0;
        for(int i =1;i<=n/2;i++)
        {
            if (n%i==0)
            {
                sum = sum + i;
            }
        }
       if(sum ==n)
       {
        System.out.println(+n+" is a Perfect number");
       }
       else
        {
        System.out.println(+n+" is not a Perfect number");
       }
    }
}
