//Code to convert Decimal number to Binary Number.
import java.util.*;
public class Question_21 {
    public static void main(String[] args)
    {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        n = Sc.nextInt();
        int r;
        int bin =0;
        int base =1;
        int n1=n;
        while(n>0)
        {
            r =n%2;
            bin = bin + base*r;
            base = base*10;
            n =n/2;
        }
        System.out.println("Binary of "+n1+" is "+bin);
    }
}
