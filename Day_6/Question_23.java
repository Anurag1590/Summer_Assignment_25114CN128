//Code to count set bits in a number.
import java.util.*;
public class Question_23 {
      public static void main(String[] args)
    {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = Sc.nextInt();
        int r;
        int bin =0;
        int base =1;
        while(n>0)
        {
            r =n%2;
            bin = bin + base*r;
            base = base*10;
            n =n/2;
        }
        int r1=0;
        int c =0;
        int n1 = bin;
        while(bin>0)
        {
            r1 =bin%10;
            if(r1==1)
            {
                c++;
            }
            bin = bin/10;
        }
        System.out.println("Number of set bits in "+n1+" is "+c);
    }
}
