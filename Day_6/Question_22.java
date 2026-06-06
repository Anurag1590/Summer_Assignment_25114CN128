//Code to convert Binary number to Decimal number.
import java.util.*;
public class Question_22 {
    public static void main(String[] args)
    {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Binary number : ");
        n = Sc.nextInt();
        double r;
        double dec =0;
        int base =0;
        int n1=n;
        while(n!=0)
        {
          r = n %10;
          dec = dec + r* (Math.pow(2,base));
          base++;
          n =n/10;

        }
        System.out.println("Decimal of "+n1+" is "+dec);
    }
}
